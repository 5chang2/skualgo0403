package problem.prg.prg_213659;

class Solution {
    int n;
    int[][] computers;
    boolean[] visited;

    void dfs(int node) {
        visited[node] = true;

        // 나(node)를 기준으로 이웃들을 탐색해서 방문
        for (int i = 0; i < n; i++) {
            // i위치를 방문 하지 않고 && i(이웃 인덱스)와 연결된경우
            if (!visited[i] && computers[node][i] == 1) {
                dfs(i);
            }
        }
    }

    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        int count = 0;

        // 내가 가지고 있는 모든 노드들을 대상으로 dfs 실행
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        return count;
    }
}