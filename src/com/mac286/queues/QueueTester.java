package com.mac286.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTester {
    public static void main(String[] args) {
        OurQueue<Integer> Q = new OurQueue<>();
        Q.add(-2);
        Q.add(-5);
        Q.add(-3);
        System.out.println("Q: " + Q);
        System.out.println("Removing: " + Q.remove());
        System.out.println("Q: " + Q);
        System.out.println("The first element: " + Q.peek());
    }
}
