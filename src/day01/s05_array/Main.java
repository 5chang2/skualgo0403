package day01.s05_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // === 1차원 배열 ===

//        int[] arr1 = new int[5];           // 크기 5, 기본값 0
//        int[] arr2 = {1, 2, 3, 4, 5};
//        int[] arr3 = new int[]{1, 2, 3};
//
//        arr1[0] = 10;
//        arr1[1] = 20;
//        System.out.println(arr1[0]);               // 10
//        System.out.println(Arrays.toString(arr1));  // [10, 20, 0, 0, 0]
//        System.out.println(arr2.length);            // 5

        // === 2차원 배열 ===

//        int[][] grid = new int[3][3];
//        int[][] grid2 = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//        for (int i = 0; i < grid2.length; i++) {
//            for (int j = 0; j < grid2[i].length; j++) {
//                System.out.print(grid2[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(Arrays.deepToString(grid2));

        // === 배열 비교 ===

//        int[] a = {1, 2, 3};
//        int[] b = {1, 2, 3};
//        System.out.println(a == b);              // false (주소 비교)
//        System.out.println(Arrays.equals(a, b)); // true (값 비교)
//
//        int[][] c = {{1, 2}, {3, 4}};
//        int[][] d = {{1, 2}, {3, 4}};
//        System.out.println(Arrays.deepEquals(c, d)); // true (깊은 비교)

        // === Arrays 유틸리티 ===

//        // 정렬
//        int[] arr = {5, 2, 8, 1, 4};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr)); // [1, 2, 4, 5, 8]
//
//        // 배열 복사
//        int[] copy = Arrays.copyOf(arr, arr.length);
//        System.out.println(Arrays.toString(copy)); // [1, 2, 4, 5, 8]
//
//        // 모든 요소를 특정 값으로 채우기
//        Arrays.fill(arr, 0);
//        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
//
//        // 2차원 배열 출력
//        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(grid)); // [[1, 2, 3], [4, 5, 6]]
//
//        // 1차원 배열 값 비교
//        int[] a = {1, 2, 3};
//        int[] b = {1, 2, 3};
//        System.out.println(Arrays.equals(a, b)); // true
//
//        // 2차원 배열 값 비교
//        int[][] c = {{1, 2}, {3, 4}};
//        int[][] d = {{1, 2}, {3, 4}};
//        System.out.println(Arrays.deepEquals(c, d)); // true
    }
}
