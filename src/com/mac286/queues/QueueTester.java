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

        //Create a Queue of Strings and a Stack of Strings.

        //add three strings to the queue and three to the stack.
        //display both.

        //remove a string from the queue and push it the the stack

        //pop a string from the stack and add it to the queue.

        //empty the stack into the queue. Display the queue.

        //empty the queue to the stack. display the stack.
    }
}
