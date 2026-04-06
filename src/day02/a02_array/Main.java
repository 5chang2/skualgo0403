package day02.a02_array;

public class Main {
    public static void main(String[] args) {
        // 1차원 배열 기본 순회
//        int[] arr = {3, 1, 4, 7, 2, 1, 7};
//
//        int minNum = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < minNum) minNum = arr[i];
//        }

        // 1차원 배열 이웃 비교
//        int[] arr = {1, 1, 3, 3, 5, 2, 4, 10};
//        System.out.println(arr[0]);
//        for (int i = 1; i<arr.length; i++) {
//            if (arr[i] != arr[i - 1]) {
//                System.out.print(arr[i]);
//            }
//        }

//        int[] arr = {2, 5, 3, 8, 1, 5};
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean leftOk = true;
//            if (i > 0){
//                leftOk = arr[i] > arr[i-1];
//            }
//
//            boolean rightOk = true;
//            if (i < arr.length - 1) {
//                rightOk = arr[i] > arr[i+1];
//            }
//
//            if (leftOk && rightOk) {
//                System.out.print(arr[i]);
//            }
//
//        }


//            int[] arr = {4, 2, 1, 7, 4, 2};
//            int[] padded = new int[arr.length + 2];
//            padded[0] = 0;
//            padded[padded.length - 1] = 0;
//            for (int i = 0; i < arr.length; i++) {
//                padded[i+1] = arr[i];
//            }

//        int[] arr = {2, 5, 4, 1, 7, 10, 4, 2, 1};
//        int n = arr.length;

        // 순서대로의 누적합을 미리 계산해놓은 변수
//        int[] prefix = new int[n+1];
//        for (int i = 0; i < n; i++) {
//            prefix[i + 1] = prefix[i] + arr[i];
//        }
//
//        int L = 3, R= 5;
//        int rangeSum = prefix[R + 1] - prefix[L];
//        System.out.println(rangeSum);


        // 슬라이딩 윈도우
//        int[] arr = {2, 5, 4, 1, 7, 10, 4, 2, 1};
//        int K = 3;
//
//        int windowSum = 0;
//        for (int i = 0; i < K; i++) {
//            windowSum += arr[i];
//        }
//        int maxSum = windowSum;
//
//        for (int i = 0; i < arr.length - K; i++) {
//            windowSum = windowSum - arr[i] + arr[i + K];
//            maxSum = Math.max(maxSum, windowSum);
//        }

        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int r = 2, c = 2;
        int N = 3 , M = 3;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        System.out.println("9의 이웃들");
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            // 범위체크 (배열 밖이면 스킵)
            if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
            System.out.println(grid[nr][nc]);
        }











    }

}
