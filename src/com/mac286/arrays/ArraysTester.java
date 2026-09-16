package com.mac286.arrays;

public class ArraysTester {
    public static void main(String[] args) {
        //create an object OurArray, add to it -2, -5, -7 and -9
        OurArray A = new OurArray(5);//the array inside the object has capacity of 5
        A.add(-2);
        A.add(-5);
        A.add(-7);
        A.add(-9);
        //Display it
        System.out.println("A: " + A);
        System.out.println("calling remove(): " + A.remove());
        System.out.println("A: " + A);
        System.out.println("calling remove(): " + A.remove());
        System.out.println("A: " + A);


    }
}
