package com.mac286.queues;

import com.mac286.stacks.OurStack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTester {
    public static void main(String[] args) {
        CircularQueue<Integer> Q = new CircularQueue<>();
        Q.add(-2);
        Q.add(-5);
        Q.add(-3);
        System.out.println("Q: " + Q);
        System.out.println("Removing: " + Q.remove());
        System.out.println("Q: " + Q);
        System.out.println("The first element: " + Q.peek());
        Q.add(-9);
        Q.add(-11);
        Q.add(-13);
        System.out.println("Q: " + Q);

        //Create a Queue of Strings and a Stack of Strings.
        OurQueue<String> QS = new OurQueue<>();
        OurStack<String> S = new OurStack<>();
        //add three strings to the queue and three to the stack.
        //display both.
        QS.add("white");
        QS.add("gray");
        QS.add("brown");
        System.out.println("QS: " + QS);
        S.push("cow");
        S.push("dog");
        S.push("cat");
        System.out.println("S: " + S);
        //remove a string from the queue and push it the the stack
        S.push(QS.remove());
        System.out.println("QS: " + QS);
        System.out.println("S: " + S);
        //pop a string from the stack and add it to the queue.
        QS.add(S.pop()); //white comes out of the stack added to the back of queue
        System.out.println("QS: " + QS);
        System.out.println("S: " + S);
        //empty the stack into the queue. Display the queue.
        while(!S.isEmpty()){
            QS.add(S.pop());
        }
        System.out.println("QS: " + QS);
        System.out.println("S: " + S);
        //empty the queue to the stack. display the stack.
        while(!QS.isEmpty()){
            S.push(QS.remove());
        }
        System.out.println("QS: " + QS);
        System.out.println("S: " + S);
        //empty again the stack back to the queue
        while(!S.isEmpty()){
            QS.add(S.pop());
        }
        System.out.println("QS: " + QS);
        System.out.println("S: " + S);
        //If you empty a queue into a stack and empty the stack back to the queue
        //the content of the queue will be reversed.
    }
}
