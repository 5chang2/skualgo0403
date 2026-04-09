package day05.a02_dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    static int[] dijkstra(int n, List<List<int[]>> graph, int start) {
        // 각 노드까지 얼마나 가까운지 기록하는 dist
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        // {거리, 노드} 형태로 저장,
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0] );
        pq.offer(new int[]{0, start});

        // pq 비어있을때 까지 반복
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int u = curr[1];

            if (cost > dist[u]) continue;

            // 내가 갈수 있는 다음 노드 탐색
            // u : 1 => {2, 2} {4, 10}
            for (int[] edge : graph.get(u)) {
                int v = edge[0];
                int weight = edge[1];

                // u : 나 / v : 목적지
                int newDist = dist[u] + weight;

                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.offer(new int[]{newDist, v});

                }

            }
        }
        return dist;

    }

    public static void main(String[] args) {
        int n = 5;
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n ; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(new int[]{2, 2});
        graph.get(1).add(new int[]{4, 10});
        graph.get(2).add(new int[]{3, 1});
        graph.get(2).add(new int[]{4, 8});
        graph.get(3).add(new int[]{4, 2});
        graph.get(4).add(new int[]{5, 1});

        int[] dist = dijkstra(n, graph, 1);

        System.out.println(Arrays.toString(dist));


    }
}
