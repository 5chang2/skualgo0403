package day01.s09_problem;

public class P08 {
    static int gcd(int a, int b) {
        // 여기에 코드를 작성합니다.
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int gcdLoop(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 12)); // 6
        System.out.println(gcdLoop(12, 18));
    }
}
