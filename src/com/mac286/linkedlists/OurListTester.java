package com.mac286.linkedlists;

import com.mac286.arrays.OurArray;

public class OurListTester {
    public static void main(String[] args) {
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
        L.add(2, -11);
        System.out.println("L: " + L);
        L.add(6, -17);
        System.out.println("L: " + L);
        L.add(0, -27);
        System.out.println("L: " + L);
        System.out.println("Removing index 2 " + L.remove(2));
        System.out.println("L: " + L);
        System.out.println("Removing index 0 " + L.remove(0));
        System.out.println("L: " + L);
        System.out.println("Removing index 5 " + L.remove(5));
        System.out.println("L: " + L);
        System.out.println("removing last: " + L.removeLast());
        System.out.println("L: " + L);
        System.out.println("element at index 2: " + L.get(2));
        System.out.println("element at index 0: " + L.get(0));
        System.out.println("element at index 3: " + L.get(3));
        L.set(1, -30);
        System.out.println("L: " + L);
    }
}
