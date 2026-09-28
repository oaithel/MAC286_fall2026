package com.mac286.stacks;

import java.util.Stack;

public class StackTester {
    static void main() {
        OurStack<String> S = new OurStack<>();
        S.push("Hi");
        S.push("How");
        S.push("Hola");
        System.out.println("S: " + S);
        System.out.println("poping: " + S.pop());
        System.out.println("S: " + S);
        System.out.println("The element at the top is: " + S.peek());
        System.out.println("S: " + S);

    }
}
