package day03.s05_bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1); graph.get(1).add(0);
        graph.get(0).add(2); graph.get(2).add(0);
        graph.get(1).add(3); graph.get(3).add(1);
        graph.get(1).add(4); graph.get(4).add(1);

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(0);

        // 큐에 데이터가 있으면 계속 동작
        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (visited[node] == true) continue;
            visited[node] = true;
            System.out.println(node);

            for (int neighbor: graph.get(node)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                }
            }


        }



    }

}
