package day03.a04_dfs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<List<Integer>> graph;
    static boolean[] visited;

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node);

        // 현재노드(node)와 연결된 모든 이웃 노드를 확인
        for (int neighbor: graph.get(node)) {
            // 이전에 방문하지 않은 이웃이라면
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        // graph = [ [1, 2], [0, 3, 4], [0], [1], [1] ]
        int n = 5;
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1); graph.get(1).add(0);
        graph.get(0).add(2); graph.get(2).add(0);
        graph.get(1).add(3); graph.get(3).add(1);
        graph.get(1).add(4); graph.get(4).add(1);

        // [false, false, false, false, false]
        visited = new boolean[n];
        dfs(0);

    }
}
