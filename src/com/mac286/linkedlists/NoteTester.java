package com.mac286.linkedlists;

public class NoteTester {
    public static void main(String[] args) {
        //create a Node N1 with value -2
        Node<Integer> N1 = new Node<>(-2);
        System.out.println("N1: " + N1);
        //Create a Node N2 with value -5 that is the next of N1
        Node<Integer> N2 = new Node<>(-5);
        System.out.println("N2: " + N2);
        N1.setNext(N2);
        //In one instruction, create a node N3 with value -7 and
        // make N1 the next of N3.
        Node<Integer> N3 = new Node<>(-7, N1);
        //change the value of N1 to -11 using reference to N3 only.
        //N3.getNext() is N1
        N3.getNext().setData(-11);
        System.out.println("N1: " + N1);
        //show the content of N2 using N3 only.
        //N2 is N1.getNext(), and N1 is N3.getNext() therefore
        //N2 is N3.getNext().getNext()
        System.out.println("N2: " + N3.getNext().getNext());
    }
}
