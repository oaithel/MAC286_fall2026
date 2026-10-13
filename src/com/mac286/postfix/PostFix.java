package com.mac286.postfix;

import com.mac286.queues.OurQueue;

/*
X = ((Y-3)^2*(A-B*C)/D+E)/B
Infix: A + B
PreFix Notation: +AB
PostFix Notation: AB+
PostFix for ((Y-3)^2*(A-B*C)/D+E)/B
Y-3 will be computed first-> postfix: Y3-
next the square Y3- ^ 2 --> postfix: Y3-2^
(A-B*C) --> A - BC* --> ABC*-
(Y-3)^2*(A-B*C) --> Y3-2^ * ABC*-  ---> Y3-2^ABC*-*
Y3-2^ABC*-* / D ---> Y3-2^ABC*-*D/ + E ---> Y3-2^ABC*-*D/E+
((Y-3)^2*(A-B*C)/D+E)/B ---> Y3-2^ABC*-*D/E+  dividing by B --> Y3-2^ABC*-*D/E+D/
What is the postfix of the following expression:
((A-B)*(C+B/D)*A/C+H)*B
  AB-
  C+B/D ---> CBD/+
  (A-B)*(C+B/D) --->  AB-CBD/+*
  (A-B)*(C+B/D)*A ---> AB-CBD/+*A*
  (A-B)*(C+B/D)*A/C ---> AB-CBD/+*A*C/
  (A-B)*(C+B/D)*A/C+H ---> AB-CBD/+*A*C/H+
  ((A-B)*(C+B/D)*A/C+H)*B ---> AB-CBD/+*A*C/H+B*
 */
public class PostFix {
    private String expression;
    private OurQueue<String> infixQ, postFix;
    public PostFix(String exp){
        expression = exp;
    }
    public PostFix(){
        expression = "";
    }
    //A method to generate the infix expression from a string
    // (23.4 - 16.7*)(12.45* (23 + 0.378)/12.2 +3)
    public OurQueue<String> generateInfix(){
        //create an infxQ
        infixQ = new OurQueue<>();
        //Have a loop to go through the string character by character
            //if current character is an operator *-/ or parenthesis,
                //add it to the infxQ as a String
            //if it's a digit, then mark the beginning and move forward with an index
                //as long as it's a digit or dot. Take the substring between the two indexes
                //as an operand (a decimal number in a string form)
        return infixQ;
    }
}
