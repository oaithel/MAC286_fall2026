package com.mac286.heaps;

import java.util.PriorityQueue;
/*
Priority Queue implement a min-Heap. The smallest has the highest priority.
When you remove, the smallest will be removed from the queue first.
 */
public class HeapTester {
    public static void main(String[] args) {
        //PriorityQueue<Integer> Q = new PriorityQueue<>();
        OurHeap<Integer> Q = new OurHeap<>();
        Q.add(8);
        Q.add(5);
        Q.add(7);
        System.out.println("Q: " + Q);
        Q.add(6);
        Q.add(3);
        System.out.println("Q: " + Q);
        Q.add(9);
        Q.add(4);
        Q.add(2);
        Q.add(10);
        System.out.println("Q: " + Q);
       // System.out.println("polling: " + Q.poll());
       // System.out.println("Q: " + Q);

    }
}
