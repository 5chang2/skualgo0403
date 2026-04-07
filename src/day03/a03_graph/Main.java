package day03.a03_graph;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int n = 5;
//        int[][] graph = new int[n][n];
//
//        graph[0][1] = 1; graph[1][0] = 1;
//        graph[0][2] = 1; graph[2][0] = 1;
//        graph[1][3] = 1; graph[3][1] = 1;
//        graph[1][4] = 1; graph[4][1] = 1;
//
//        for (int i = 0; i < n; i++) {
//            if (graph[1][i] == 1) {
//                System.out.println("1의 이웃" + i);
//            }
//        }

        int n = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1); graph.get(1).add(0);
        graph.get(0).add(2); graph.get(2).add(0);

        for (int neighbor: graph.get(0)) {
            System.out.println(neighbor);
        }


    }
}
