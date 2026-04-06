package day02.a03_bf;

public class Main {

    // 약수의 개수 ver1
    static int countDivisor(int n) {
        int count = 0;

        // 1, 2, 4, 5, 10, 20, 25, 50, 100
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }

    // 약수의 개수 ver2
    static int countDivisorOptimized(int n) {
        int count = 0;
        for (int i = 1; i * i <= n ; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDivisor(123));
        System.out.println(countDivisorOptimized(123));
    }
}
