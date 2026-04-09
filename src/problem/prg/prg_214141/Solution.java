package problem.prg.prg_214141;


import java.util.PriorityQueue;

class Solution {
    // 10, 3, 7, 2
    public int solution(int[] ability, int number) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a : ability) {
            pq.offer(a);
        }

        for (int i = 0; i < number; i++) {
            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;

            pq.offer(sum);
            pq.offer(sum);
        }

        int result = 0;
        while (!pq.isEmpty()) {
            result += pq.poll();
        }

        return result;

    }
}