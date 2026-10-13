package com.mac286.postfix;

public class PostFixTester {
    public static void main(String[] args) {
        PostFix P = new PostFix("(13.4 -    12.6 * 10)/(3.2/ 5.6 -32)*.25");
        //postFix:  13.4 12.6 10 * - 3.2 5.6 / 32 - / .25 *
        System.out.println("Infix: " + P.getInfix());
        P.generatePostFix();
        System.out.println("PostFix: " + P.getPostfix());
        System.out.println("Evaluation: " + P.evaluate());
    }
}
