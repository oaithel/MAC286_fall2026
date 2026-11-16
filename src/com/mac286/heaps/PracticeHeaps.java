package com.mac286.heaps;

import com.mac286.stacks.OurStack;

import java.util.Arrays;
import java.util.Random;

/*
Design a static method that returns an array of specific size of random integers
between -max and +max (max is an input value).
 */
public class PracticeHeaps {
    public static int[] generateArray(int num, int max){
        //create an OurStack object
        int[] s = new int[num];
        Random generator = new Random();
        for(int i = 0; i < num; i++) {
            s[i] = max - generator.nextInt(2*max+1);
        }
        return s;
    }
    public static void main(String[] args) {
        final int SIZE = 20;
        //Generate an array of 20 random integers.
        int[] A = generateArray(SIZE, 300);
        System.out.println("Before A: " + Arrays.toString(A));
        //with the help of a heap, sort the array in desceneding order.
        //largest at index 0 and smallest at the last index.
        OurHeap<Integer> H = new OurHeap<>();
        for(int i =0; i < SIZE; i++){
            H.add(A[i]);
        }
        //When removing from heap, we remove the smallest.
        //We start from the end of the array because the smallest has to go there
        for(int i = SIZE-1; !H.isEmpty() && i >= 0; i--){
            A[i] = H.poll();
        }
        System.out.println("After A: " + Arrays.toString(A));
    }
}
