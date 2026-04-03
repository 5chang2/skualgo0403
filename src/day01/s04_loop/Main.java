package day01.s04_loop;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // === for문 ===

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i); // 0, 1, 2, 3, 4
//        }

        // === break, continue ===

//        for (int i = 0; i < 10; i++) {
//            if (i == 3) continue;
//            if (i == 7) break;
//            System.out.print(i + " "); // 0 1 2 4 5 6
//        }
//        System.out.println();

        // === 구구단 ===

//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//            System.out.println();
//        }

        // === 향상된 for문: 배열 ===

//        int[] nums = {1, 2, 3, 4, 5};
//        for (int num : nums) {
//            System.out.print(num + " "); // 1 2 3 4 5
//        }
//        System.out.println();
//
//        int [] nums2 = {11, 12, 13, 14, 15};
//        for (int i = 0; i < 5; i ++) {
//            System.out.println(nums2[i] + " ");
//        }

        // === 향상된 for문: 문자열 ===

//        String s = "hello";
//        for (char c : s.toCharArray()) {
//            System.out.print(c + " "); // h e l l o
//        }
//        System.out.println();

        // === while문 ===

//        int i = 0;
//        while (i < 5) {
//            System.out.print(i + " "); // 0 1 2 3 4
//            i++;
//        }
//        System.out.println();

        // === 1~100 합 ===

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println("합: " + sum); // 5050
    }
}
