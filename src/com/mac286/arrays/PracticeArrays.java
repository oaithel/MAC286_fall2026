package com.mac286.arrays;

import com.mac286.stacks.OurStack;

import java.util.Arrays;
import java.util.Random;

public class PracticeArrays {
    //TODO: Write a static method that accepts  size and a max
    // and generates randomly an array of that size of integers between -max and +max
    public static int[] generateArray(int num, int max){
        //create an OurStack object
        int[]  s = new int[num];
        Random generator = new Random();
        for(int i = 0; i < num; i++){
            s[i] = max - generator.nextInt(2*max+1);
        }
        return s;
    }

    public static void main(String[] args) {
        //TODO: Create an array of 20 random integers between -300 and +300
        // using the static method above.
        int[] A = generateArray(20, 300);
        //display the content of the array.
        System.out.println("A: " + Arrays.toString(A));
        //using an OurArray object for help, reorganize the original array so
        //that negative numbers are put to the left of the array and positive
        //numbers to the right (respect the relative order of number in the original
        //array, id for instance -4 appears before -6, it should stay that way
        //in the reorganized array
        OurArray<Integer> help = new OurArray<>(20);
        //go through array and put all negative numbers into Ourarray object.
        for(int i = 0; i < 20; i++){
            if(A[i] < 0){
                help.add(A[i]);
            }
        }
        //Do the same for positive numbers
        for(int i = 0; i < 20; i++){
            if(A[i] >= 0){
                help.add(A[i]);
            }
        }
        //TODO: HW4 do what both loops did in a single loop.The end result
        //should be help object in the same shape/order. Not easy!!!
        //empty OurArray object removing first into the array
        //Hint: Count number of negatives, it may help. And use other methods
        //of Ourarray
        int i = 0;
        while(!help.isEmpty()){
            A[i] = help.removeFirst();
            i++;
        }
        System.out.println("After A: " + Arrays.toString(A));
    }
}
