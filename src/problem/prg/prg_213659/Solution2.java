package problem.prg.prg_213659;

import java.util.ArrayDeque;

public class Solution2 {
    int n;
    int[][] computers;
    boolean[] visited;

    void dfs(int start) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            // node (나의 현재 노드값)
            int node = stack.pop();
            // 이미 방문 한적이 있으면 다음 while로 넘어가기
            if (visited[node]) continue;
            visited[node] = true;

            for (int i = 0; i < n ;i++) {
                if (!visited[i] && computers[node][i] == 1) {
                    stack.push(i);
                }
            }

        }


    }

    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        return count;

    }
}
