package com.mac286.arrays;

import java.util.Vector;

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
        A.add(2, -13);
        System.out.println("A: " + A);

        //TODO: add element using the different add methods so that at the end you have at
        //least 8 and more than you day of birth elements in the array.
        A.add(4, -23);
        System.out.println("A: " + A);
        A.add(1, -33);
        System.out.println("A: " + A);
        A.add(5, -43);
        System.out.println("A: " + A);
        A.add(3, -36);
        System.out.println("A: " + A);
        //TODO: test method get
        System.out.println("Element at index 4 is: " + A.get(4));
        //Test the remove(ind) method
        System.out.println("removing element at index 3: " + A.remove(3));
        System.out.println("A: " + A);
        //TODO: in one instruction move element at index 5 to index 3.
        A.add(3, A.remove(5));
        System.out.println("A: " + A);

    }
}
