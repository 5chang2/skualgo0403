package day03.a02_recursion;

import java.util.*;

public class Main {

    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }

    static int fibNaive(int n) {
        if (n <= 1) return n;
        return fibNaive(n-1) + fibNaive(n-2);
    }

    static int[] memo;

    static int fibMemo(int n) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        memo[n] = fibMemo(n-1) + fibMemo(n-2);
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibNaive(30));

        memo = new int[101];
        Arrays.fill(memo, -1);
        System.out.println(fibMemo(40));

    }
}
