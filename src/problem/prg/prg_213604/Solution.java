package problem.prg.prg_213604;

import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayDeque<Integer> basket = new ArrayDeque<>();
        int count = 0;

        for (int move: moves) {
            int col = move - 1;

            // move -> 해당 위치에 인형이 있는지 확인
            for (int row = 0; row < board.length; row++) {
                // 인형이 있는지 검증
                if (board[row][col] != 0) {
                    int doll = board[row][col];
                    board[row][col] = 0;

                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        count += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;

                }
            }

        }
        return count;

    }
}