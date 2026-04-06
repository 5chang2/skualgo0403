package problem.prg.prg_213265;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int castTime = bandage[0];
        int healPerSec = bandage[1];
        int bonusHeal = bandage[2];

        int maxHealth = health;
        int currentHealth = health;

        int lastAttackTime = attacks[attacks.length - 1][0];

        int consecutive = 0;
        int attackIdx = 0;

        for (int t = 1; t <= lastAttackTime; t++) {
            // 공격당하거나
            if (attackIdx < attacks.length && attacks[attackIdx][0] == t) {
                currentHealth -= attacks[attackIdx][1];
                consecutive = 0;
                attackIdx++;

                if (currentHealth <= 0) {
                    return -1;
                }

            // 힐을 하거나
            } else {
                consecutive++;
                currentHealth += healPerSec;

                // 연속성공했는지
                if (consecutive == castTime) {
                    currentHealth += bonusHeal;
                    consecutive = 0;
                }

                // 최대 체력 제한
                if (currentHealth > maxHealth) {
                    currentHealth = maxHealth;
                }
            }
        }
        return currentHealth;
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