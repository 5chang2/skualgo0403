package problem.prg.prg_213265;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        int[] bandage1 = {5, 1, 5};
        int health1 = 30;
        int[][] attacks1 = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        int[] bandage2 = {3, 2, 7};
        int health2 = 20;
        int[][] attacks2 = {{1, 15}, {5, 16},{8, 6}};

        int[] bandage3 = {4, 2, 7};
        int health3 = 20;
        int[][] attacks3 = {{1, 15}, {5, 16},{8, 6}};

        int[] bandage4 = {1, 1, 1};
        int health4 = 5;
        int[][] attacks4 = {{1, 2}, {3, 2}};

        Solution sol = new Solution();
        System.out.println(sol.solution(bandage1, health1, attacks1));
        System.out.println(sol.solution(bandage2, health2, attacks2));
        System.out.println(sol.solution(bandage3, health3, attacks3));
        System.out.println(sol.solution(bandage4, health4, attacks4));
    }
}