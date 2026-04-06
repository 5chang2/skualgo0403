package problem.prg.prg_213467;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dh = {-1, 1, 0, 0};
        int[] dw = {0, 0, -1, 1};

        int count = 0;
        String color = board[h][w];

        for (int i = 0; i < 4; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];

            // 내가 가진 범위를 넘어간 경우
            if (nh < 0 || nh >= board.length || nw < 0 || nw >= board[0].length ) continue;
            if (board[nh][nw].equals(color)) {
                count++;
            }
        }
        return count;
    }
}
