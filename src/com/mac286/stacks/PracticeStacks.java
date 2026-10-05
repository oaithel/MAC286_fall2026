package com.mac286.stacks;

import com.mac286.arrays.OurArray;
import com.mac286.queues.OurQueue;

import java.util.Random;

/*
Write a static method that returns an object OurStack of integers with specific number
elements and the elements will be between -max and +max
public static OurStack<Integer> generateStack(int num, int max)

In main, create a stack of 20 random integers.
We want to reorganize the content of the stack in a way negative numbers
go to the bottom of the stack and positive to the top.
Example: [-3, 4, -9, 16, -7, -10, 26, 5] The stack will be reorganized to
[-3, -9, -7, -10, 4, 16, 28, 5] (the relative order is kept)
1- Using two additional stacks for help (total of three stacks)
2- Same problem using only one OurArray for help. Keep the relative order in which
negative numbers appear, same for positive numbers.

to empty a stack we use a while loop
while(!S.isEmpty()){
        ....
        S.pop();
        ....
}
 */
public class PracticeStacks {
    public static OurStack<Integer> generateStack(int num, int max){
        //create an OurStack object
        OurStack<Integer> stack = new OurStack<>();
        Random generator = new Random();
        for(int i = 0; i < num; i++){
            stack.push(max - generator.nextInt(2*max+1));
        }
        return stack;
    }

    static void main() {
        //create a stack of 20 random numbers between -300 and +300
        OurStack<Integer> mainStack = generateStack(20, 300);
        System.out.println("Before S: " + mainStack);
        //1 Using two additional stacks for help
        OurStack<Integer> negatives = new OurStack<>();
        OurStack<Integer> positives = new OurStack<>();
        //empty the mainStack into the two stacks
        while(!mainStack.isEmpty()){
            if(mainStack.peek() < 0){
                negatives.push(mainStack.pop());
            }else{
                positives.push(mainStack.pop());
            }
        }
        //empty the negatives stack into the mainstack
        while(!negatives.isEmpty()){
            mainStack.push(negatives.pop());
        }
        //empty the positives stack into mainstack
        while(!positives.isEmpty()){
            mainStack.push(positives.pop());
        }
        System.out.println("After S: " + mainStack);

        //TODO: generate another stack of 20 integers
        mainStack = generateStack(20, 300);
        //display it (before)
        System.out.println("-------------Using one OurArray Object ---------");
        System.out.println("Before S: " + mainStack);
        //create an OurArray object
        OurArray<Integer> A = new OurArray<>();
        //empty the stack into OurArray object in a way you deem appropriate to
        //sort the numbers
        while(!mainStack.isEmpty()){
            if(mainStack.peek() < 0){
                A.addFirst(mainStack.pop());
            }else{
                A.addLast(mainStack.pop());
            }
        }
        //empty theOurArray object back into the stack in a way the stack is
        //reorganized as expected.
        while(!A.isEmpty() && A.get(0) < 0){
            mainStack.push(A.removeFirst());
        }
        while(!A.isEmpty()){
            mainStack.push(A.removeLast());
        }
        System.out.println("After S: " + mainStack);
        //TODO: generate another stack of 20 integers
        mainStack = generateStack(20, 300);
        //display it (before)
        System.out.println("-------------Using a Queue Object for help ---------");
        //display it (before)
        System.out.println("Before S: " + mainStack);
        //create an OurQueue object
        OurQueue<Integer> Q = new OurQueue<>();
        //empty the stack into the queue
        while(!mainStack.isEmpty()){
            Q.add(mainStack.pop());
        }
        //empty the queue back into the stack. You may have to use multiple loops.
        //for instance if the front is negative remove it and push it to the stack
        //if positive remove it and put it to the back, untill only positive
        //numbers are left in the queue then empty the queue back in the stack.
        int S = Q.size();
        for(int i = 0; i < S; i++){
            if(Q.peek() < 0){
                mainStack.push(Q.remove());
            }else {
                Q.add(Q.remove());
            }
        }
        //push the remaining positive numbers to the stack to reverse everything
        while(!Q.isEmpty()){
            mainStack.push(Q.remove());
        }
        //System.out.println("After S: " + mainStack);
        //put back the numbers in the Q to have them in the correct order,
        //but positives will be in the front.
        while(!mainStack.isEmpty()){
            Q.add(mainStack.pop());
        }
        //System.out.println("After Q: " + Q);
        //now we have positive numbers in the front, we need to move them to
        //the back
        while(Q.peek() >= 0){
            Q.add(Q.remove());
        }
        //put the Queue back to the stack
        while(!Q.isEmpty()){
            mainStack.push(Q.remove());
        }
        System.out.println("After S: " + mainStack);
    }
}
