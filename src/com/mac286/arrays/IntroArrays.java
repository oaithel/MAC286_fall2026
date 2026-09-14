package com.mac286.arrays;

public class IntroArrays {
    static void main() {
        //An array is a collection of variables that can be accessed using an index.
        //To define an array we use the following: type[] arrayName = ...
        int[] Ar = {-2, -5, -7, -8}; //this is a constant array
        int[] array = new int[10]; //creates an array of 10 integers
        System.out.println("The length is: " + Ar.length);
        System.out.println("The value of the third element is: " + Ar[2]);
        //display all elements of the array in the following form: [-2, -5, -7, -8]
        //diaplay a bracket without going to next line
        System.out.print("[");
        //loop element comma, ...
        for(int i = 0; i < 4; i++){
            if(i == 3){
                System.out.print(Ar[i]);
            }else {
                System.out.print(Ar[i] + ", ");
            }
        }
        //display a closing bracket, go to next line
        System.out.println("]");

        //We have a problem with the last comma. How to solve that??
        //1. solution: use if: if last element don't display comma
        //Not very efficient, there one extra test everytime for one comma!!!
        //2. Deal with n-1 elements then deal with the last exception seprately
        System.out.print("[");
        //loop element comma, ...
        for(int i = 0; i < 3; i++){
            System.out.print(Ar[i] + ", ");
        }
        //display the last one without comma
        System.out.print(Ar[3]);
        //display a closing bracket, go to next line
        System.out.println("]");

        //We can also use the pattern comma number except for the first which is going
        //to be delt with separately.
        System.out.print("[" + Ar[0]);
        //loop comma element, ....
        for(int i = 1; i < 4; i++){
            System.out.print(", " +Ar[i]);
        }
        //display a closing bracket, go to next line
        System.out.println("]");

    }
}
