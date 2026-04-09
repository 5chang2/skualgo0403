package day05.a01_pq;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // 완전이진트리 최소힙
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(5);
        minHeap.offer(7);
        minHeap.offer(2);
        minHeap.offer(1);
        minHeap.offer(10);

        System.out.println(minHeap.peek());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.peek());

        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(10);
        maxHeap.offer(100);

        System.out.println(maxHeap.peek());

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1] );

        pq.offer(new int[]{1, 100});
        pq.offer(new int[]{5, 30});
        pq.offer(new int[]{2, 90});

        System.out.println(Arrays.toString(pq.peek()) );



    }
}
