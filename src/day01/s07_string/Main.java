package day01.s07_string;


public class Main {
    public static void main(String[] args) {
        // === String 주요 메서드 ===

//        String s = "Hello World";
//        System.out.println(s.length());          // 11
//        System.out.println(s.charAt(0));         // 'H'
//        System.out.println(s.substring(0, 5));   // "Hello"
//        System.out.println(s.indexOf('W'));       // 6
//        System.out.println(s.indexOf("World"));  // 6
//        System.out.println(s.contains("World")); // true
//        System.out.println(s.equals("Hello World")); // true

        // === 변환 메서드 ===

//        String s = "  Hello World  ";
//        System.out.println(s.trim());               // "Hello World"
//        System.out.println(s.trim().toLowerCase());  // "hello world"
//        System.out.println(s.trim().toUpperCase());  // "HELLO WORLD"
//        System.out.println(s.trim().replace("World", "Java")); // "Hello Java"

        // === split & join ===

//        String csv = "a,b,c,d";
//        String[] parts = csv.split(",");
//        for (String part : parts) {
//            System.out.print(part + " "); // a b c d
//        }
//        System.out.println();
//
//        String joined = String.join("-", parts);
//        System.out.println(joined); // "a-b-c-d"
//
//        char[] chars = "hello".toCharArray();

        // === StringBuilder ===

//        StringBuilder sb = new StringBuilder("hello");
//        sb.append(" world");    // "hello world"
//        sb.insert(5, ",");      // "hello, world"
//        sb.delete(5, 6);        // "hello world"
//        sb.deleteCharAt(4);     // "hell world"
//        sb.reverse();           // "dlrow lleh"
//        System.out.println(sb.toString());

        // === 문자열 뒤집기 ===

//        String s = "algorithm";
//        String reversed = new StringBuilder(s).reverse().toString();
//        System.out.println(reversed); // "mhtirogla"

        // === 투 포인터 뒤집기 ===

//        String s = "algorithm";
//        char[] chars = s.toCharArray();
//        int left = 0, right = chars.length - 1;
//        while (left < right) {
//            char temp = chars[left];
//            chars[left] = chars[right];
//            chars[right] = temp;
//            left++;
//            right--;
//        }
//        System.out.println(new String(chars)); // "mhtirogla"

        // === 팰린드롬 판별 ===

//        String s = "abcba";
//        String reversed = new StringBuilder(s).reverse().toString();
//        System.out.println(s.equals(reversed)); // true

        // === 투 포인터 팰린드롬 ===

//        String s = "abcba";
//        boolean isPalindrome = true;
//        int left = 0, right = s.length() - 1;
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        System.out.println(isPalindrome); // true

        // === 숫자 추출 ===

//        String mixed = "abc123def456";
//        StringBuilder sb = new StringBuilder();
//        for (char c : mixed.toCharArray()) {
//            if (Character.isDigit(c)) {
//                sb.append(c);
//            }
//        }
//        System.out.println(sb.toString()); // "123456"
//
//        String numbersOnly = mixed.replaceAll("[^0-9]", "");
//        System.out.println(numbersOnly); // "123456"
    }
}
