package problem.prg.prg_214354;

public class Solution {
    public int[] solution(String command) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0;
        int dir = 0; // 0: 위, 1: 오른쪽, 2: 아래, 3: 왼쪽

        for (char c : command.toCharArray() ) {
            if (c == 'G') {
                x = x + dx[dir];
                y = y + dy[dir];
            } else if (c == 'B') {
                x = x - dx[dir];
                y = y - dy[dir];
            } else if (c == 'R') {
                dir = (dir + 1) % 4;
                // dir (0 + 1) % 4 = 1
                // dir (3 + 1) % 4 = 0
            } else {
            // L인경우
                dir = (dir + 3) % 4;
            }
        }

        return new int[]{x, y};

    }
}
