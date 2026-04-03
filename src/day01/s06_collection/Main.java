package day01.s06_collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // === ArrayList ===

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(1, 15);        // [10, 15, 20, 30]
//        System.out.println(list.get(0));    // 10
//        System.out.println(list.size());    // 4
//        System.out.println(list.contains(20)); // true
//        int removed = list.remove(0);       // removed = 10
//        System.out.println(list);           // [15, 20, 30]

        // === ArrayList 초기화 ===

//        int[] myList = {1, 2, 3};
//        ArrayList<String> names = new ArrayList<>(Arrays.asList("A", "B", "C"));
//        System.out.println(names); // [A, B, C]

        // === HashMap ===

        HashMap<String, Integer> votes = new HashMap<>();
        votes.put("갑", 5);
        votes.put("을", 3);
        votes.put("병", 7);
//        System.out.println(votes.get("정"));              // 5
//        System.out.println(votes.getOrDefault("정", 100));  // 0
//        System.out.println(votes.containsKey("을"));      // true
//        System.out.println(votes.size());                 // 3
//        votes.remove("병");
//
        // votes.keySet() => {"갑", "을", "병"}
//        for (String key : votes.keySet()) {
//            System.out.println(key + ": " + votes.get(key));
//        }
//
//        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        // === 빈도수 세기 패턴 ===

//        String s = "banana";
//        HashMap<Character, Integer> count = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//        System.out.println(count); // {a=3, b=1, n=2}

        // === HashSet ===

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // 중복 무시
        System.out.println(set);             // [1, 2, 3]
        System.out.println(set.contains(2)); // true
        System.out.println(set.size());      // 3
        set.remove(1);
        System.out.println(set);             // [2, 3]

        // === 집합 연산 ===

        HashSet<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> B = new HashSet<>(Arrays.asList(3, 4, 5));

        HashSet<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("교집합: " + intersection); // [3]

        HashSet<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("합집합: " + union); // [1, 2, 3, 4, 5]

        HashSet<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("차집합: " + difference); // [1, 2]
    }
}
