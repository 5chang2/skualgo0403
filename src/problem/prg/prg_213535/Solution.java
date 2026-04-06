package problem.prg.prg_213535;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int height = 3; height <= total; height++) {
            if (total % height != 0) continue;
            int width = total / height;
            if (width < height) break;

            // 노란색 영역 검증
            if ((width - 2) * (height - 2) == yellow) {
                return new int[]{width, height};
            }
        }
        return new int[]{};
    }
}