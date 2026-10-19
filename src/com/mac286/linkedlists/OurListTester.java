package com.mac286.linkedlists;

public class OurListTester {
    static void main() {
        //create OurList object of integers
        OurList<Integer> L  = new OurList<>();
        //add to it -3, -5, -7 and -9
        L.add(-3);
        L.add(-5);
        L.add(-7);
        L.add(-9);
        //display it.
        System.out.println("L: " + L);
        L.addFirst(-13);
        L.addFirst(-17);
        System.out.println("L: " + L);
        System.out.println("removing first: " + L.removeFirst());
        System.out.println("L: " + L);
    }
}
