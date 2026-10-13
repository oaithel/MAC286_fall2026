package com.mac286.postfix;

import com.mac286.queues.OurQueue;
import com.mac286.stacks.OurStack;

import static java.lang.Double.NaN;

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
        this.generateInfix();
        postFix = null;

    }
    public PostFix(){
        expression = "";
        infixQ = null;
        postFix = null;
    }
    public OurQueue<String> getInfix() {
        return infixQ;
    }
    public OurQueue<String> getPostfix() {
        return postFix;
    }

    //A method to generate the infix expression from a string
    // (23.4 - 16.7*)(12.45* (23 + 0.378)/12.2 +3)
    private void generateInfix(){
        infixQ = new OurQueue<String>();
        for(int i = 0; i < expression.length(); i++){
            //skip spaces
            while(expression.charAt(i) == ' ') {
                i++;
            }
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' ||expression.charAt(i) == '*' || expression.charAt(i) == '/' || expression.charAt(i) == '(' || expression.charAt(i) == ')')
            {
                    infixQ.add(Character.toString(expression.charAt(i)));
            }
            else if(expression.charAt(i) == '.' || Character.isDigit(expression.charAt(i))){
                int start = i;
                while(i < expression.length() && (expression.charAt(i) == '.' || Character.isDigit(expression.charAt(i)))){
                    i++;
                }
                //expression.charAt(i) is not a dot and not a digit
                String operand = expression.substring(start, i);
                infixQ.add(operand);
                i--; //go back so that the i++ in for loop will not skip one character
            }else{
                //invalid character
                System.out.println("Invalid expression");
            }
        }
    }
    private boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            return true;
        }
        return false;
    }
    private boolean higherPrecedence(String first, String second) {
            if(second.equals("+") || second.equals("-")) {
                return true;
            }else {
                if(first.equals("*") || first.equals("/")) {
                    return true;
                }
            }
            return false;
    }
    public OurQueue<String> generatePostFix() {
        postFix = new OurQueue<>();
        if (infixQ == null || infixQ.isEmpty()) {
            this.generateInfix();
            if (infixQ == null || infixQ.isEmpty()) {
                System.out.println("Cannot generate PostFix infix is invalid");
                return null;
            }
        }
        OurStack<String> stack = new OurStack<>();
        while(!infixQ.isEmpty()) {
            String item = infixQ.remove();
            if (item.equals("(")) {
                stack.push(item);
            } else if (isOperator(item)) {
                while (!stack.isEmpty()&& isOperator(stack.peek()) && higherPrecedence(stack.peek(), item)) {
                    postFix.add(stack.pop());
                }
                stack.push(item);
            } else if (item.equals(")")) {
                //remove items from stack add them to postfix until we reach
                //openning parenthesis.
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    postFix.add(stack.pop());
                }
                if (stack.isEmpty()) {
                    System.out.println("Invalid expression!");
                    return null;
                } else {
                    //top of stack is ( discard it)
                    stack.pop();
                }
            } else {
                //this has to be an operand
                postFix.add(item);
            }
        }
        //empty the stack into postFix
        while(!stack.isEmpty()) {
            postFix.add(stack.pop());
        }
        return postFix;
    }
    public double evaluate(){
        if(postFix.isEmpty()){
            generatePostFix();
            if(postFix.isEmpty()){
                System.out.println("Invalid expression");
                return NaN;
            }
        }
        //create a stack for the operands
        OurStack<String> stack = new OurStack<>();
        while(!postFix.isEmpty()){
            String item = postFix.remove();
            if(isOperator(item)){
                //we assuming only binary operators
                //there has to be two items in the stack otherwise there is a problem

                //pop one operator from the stack call it second

                //pop another one call it first.

                //convert both first and second to double (they are strings)

                //perform the operation first op second. Convert the result to String and
                //push it to stack.
            }
        }
        //At the end there should be only one result in the stack.
        //covert it to double and return it.
    }
}

