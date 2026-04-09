package day05.a02_dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Main {
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



    }
}
