package day04.a02_sort;

import java.lang.reflect.Array;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static class Student implements Comparable<Student> {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Student other) {
            // 음수 : this가 other보다 앞
            // 0 : 같다
            // 양수 : other가 this보다 앞
            return other.score - this.score;
        }
    }

    public static void main(String[] args) {
        // 기본형 배열
        int[] arr = {5, 2, 1, 4, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 래퍼 타입 배열
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 1, 4, 7));
        Collections.sort(list);
        System.out.println(list);

        // 래퍼 타입 내림차순
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Student[] students = {
                new Student("kim", 50),
                new Student("park", 30),
                new Student("lee", 90)
        };

        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }

        String[] words = {"banana", "apple", "grape", "watermelon"};
        Arrays.sort(words, (a, b) -> b.length() - a.length());
        System.out.println(Arrays.toString(words));

        int[][] intervals = { {3, 6}, {1, 4}, {10, 20}, {5, 10} };
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        for (int[] i: intervals) {
            System.out.println(Arrays.toString(i));
        }



    }
}
