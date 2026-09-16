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
        A.addFirst(-11);
        System.out.println("A: " + A);
        int num = A.removeFirst();
        System.out.println("removing the first: " + num);
        System.out.println("A: " + A);

        //TODO: Test add at specific index method and remove at specific index method.

        //TODO: add element using the different add methods so that at the end you have at
        //least 8 and more than you day of birth elements in the array.

        //TODO: test method get

        //TODO: in one instruction move element at index 7 to index 3.

    }
}
