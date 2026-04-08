package day04.a01_backtracking;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {
    static int N, R;
    static int[] arr;
    static int[] selected;
    static boolean[] visited;

    static void perm(int depth) {
        if (depth == R) {
            for (int i = 0; i < R; i++) {
                System.out.print(selected[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            selected[depth] = arr[i];
            perm(depth+1);
            visited[i] = false;

        }
    }

    static void comb(int depth, int start) {
        if (depth == R) {
            for (int i = 0; i < R; i++) {
                System.out.print(selected[i]);
            }
            System.out.println();
            return;
        }

        for (int i = start; i < N; i++){
            selected[depth] = arr[i];
            comb(depth+1, i + 1);
        }
    }

    public static void main(String[] args) {
        arr = new int[]{1, 2, 3, 4};
        N = arr.length;
        R = 2;
        selected = new int[R];
        visited = new boolean[N];
//        perm(0);
//        comb(0, 0);

//        System.out.println(5 & 3); // 101 & 011 = 001
//        System.out.println(5 | 3); // 101 | 011 = 111 => 7
//        System.out.println(5 ^ 3); // 101 ^ 011 = 110 => 6
//        System.out.println(1 << 3); // 1 -> 1000 (x2)씩 하기
//        System.out.println(8 >> 3); // 1000 -> 1 (/2)씩 하기

        // arr 내가 가진 집합, N 집합길이
        for (int mask = 0; mask < (1 << N); mask++) {
            System.out.print("{");

            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0)  {
                    System.out.print(arr[i]);
                }
            }

            System.out.println("}");
        }


    }
}
