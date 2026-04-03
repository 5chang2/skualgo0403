package day01.a01_variable;

public class Main {
    public static void main(String[] args) {
        // === 대입 연산자 ===

        int age = 3;
        age = 5;
        int a = 3, b = 4, c = 5;
        int x, y, z;
        x = y = z = 0;
        System.out.printf("%d %d %d\n", x, y, z); // 0 0 0

        // === 산술 연산자 ===

//        int a = 10, b = 3;
//        System.out.println(a + b);  // 13
//        System.out.println(a - b);  // 7
//        System.out.println(a * b);  // 30
//        System.out.println(a / b);  // 3 (정수 나눗셈: 소수점 버림)
//        System.out.println(a % b);  // 1 (나머지)
//        System.out.println((double) a / b); // 3.3333333333333335

        // === 복합 대입 연산자 ===

//        int x = 10;
//        x += 3;  // 13
//        x -= 2;  // 11
//        x *= 4;  // 44
//        x /= 5;  // 8
//        x %= 3;  // 2
//        System.out.println(x); // 2

        // === 복합 대입 주의점 ===

//        int x = 3;
//        x = x * (7 - 2) / 7; // 3 * 5 / 7 = 15 / 7 = 2
//        System.out.println(x); // 2
//
//        int y = 3;
//        y *= (7 - 2) / 7; // 우항: (7-2)/7 = 5/7 = 0 → y = 3 * 0 = 0
//        System.out.println(y); // 0

        // === 증감 연산자 ===

//        int a = 3;
//        System.out.println(++a); // 4 (먼저 증가, 그 다음 출력)
//        System.out.println(a++); // 4 (먼저 출력, 그 다음 증가)
//        System.out.println(a);   // 5 (위에서 증가된 결과)

        // === 비교 연산자 ===

//        int a = 3, b = 3;
//        System.out.println(a == b); // true
//
//        String s1 = "hello";
//        String s2 = new String("hello");
//        System.out.println(s1 == s2);      // false (주소 비교)
//        System.out.println(s1.equals(s2)); // true (값 비교)

        // === 논리 연산자 ===

//        System.out.println(true && true);   // true
//        System.out.println(true && false);  // false
//        System.out.println(false || true);  // true
//        System.out.println(false || false); // false
//
//        boolean flag = false;
//        System.out.println(!flag); // true

        // === 단축 평가 ===

//        int[] arr = {1, 2, 3};
//        int i = 5;
//        if (i < arr.length && arr[i] > 0) {
//            System.out.println("조건 통과");
//        }

        // === && vs || 우선순위 ===

//        System.out.println(true || true && false);   // true (&&가 먼저 처리)
//        System.out.println((true || true) && false); // false

        // === 삼항 연산자 ===

//        int a = 1, b = 2;
//        int max = (a > b) ? a : b;
//        System.out.println(max); // 2
//
//        int score = 85;
//        String result = (score >= 60) ? "합격" : "불합격";
//        System.out.println(result); // 합격
    }
}
