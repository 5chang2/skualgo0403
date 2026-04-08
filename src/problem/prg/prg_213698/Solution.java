package problem.prg.prg_213698;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 방문 체크, 거리계산
        int[][] dist = new int[n][m];
        for (int[] row: dist) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        dist[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                // 벽이거나 이미 방문한 경우
                if (maps[nx][ny] == 0 || dist[nx][ny] != -1) {
                    continue;
                }

                // 내가 방문 했다 표시 / 거리계산값 등록
                dist[nx][ny] = dist[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }

        }
        return dist[n-1][m-1];

    }
}
