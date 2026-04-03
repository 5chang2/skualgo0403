package day01.s09_problem;

import java.util.HashMap;
import java.util.Arrays;

public class P09 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 11, 13};
        int target = 9;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println(i + " " + j);
//                    break;
//                }
//            }
//        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
                break;
            } else {
                map.put(arr[i], i);
            }
        }


    }
}
