package com.mac286.stacks;

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
        System.out.println("Before S: " + mainStack);

        //TODO: generate another stack of 20 integers

        //display it (before)

        //create an OurArray object

        //empty the stack into OurArray object in a way you deem appropriate to
        //sort the numbers

        //empty theOurArray object back into the stack in a way the stack is
        //reorganized as expected.
    }
}
