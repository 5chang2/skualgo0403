package problem.prg.prg_213697;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Solution {
    String[] maps;
    boolean[][] visited;
    int rows, cols;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int[] solution(String[] maps) {
        this.maps = maps;
        rows = maps.length;
        cols = maps[0].length();
        visited = new boolean[rows][cols];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // maps[i][j]
                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    result.add(dfs(i, j));
                }
            }
        }

        if (result.isEmpty()) return new int[]{-1};
        Collections.sort(result);

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;



    }

    int dfs(int x, int y) {
        visited[x][y] = true;
        int sum = maps[x].charAt(y) - '0';

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            // 범위를 넘어간경우
            if (nx < 0 || nx >= rows || ny < 0 || ny >= cols) continue;
            // 방문 했거나 바다인경우
            if (visited[nx][ny] || maps[nx].charAt(ny) == 'X') continue;
            sum += dfs(nx, ny);
        }
        return sum;
    }
}