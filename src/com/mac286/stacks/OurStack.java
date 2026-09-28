package com.mac286.stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class OurStack <T>{
    //An array of Ts
    private T[] array;
    //declare a variable for size
    private int size;
    //default constructor, create an array of 10 integers. Set size to 0
    public OurStack() {
        array = (T[]) new Object[10];
        size = 0;
    }

    //The interface of standard stack has the following:
    //isEmpty method return true if the stack is empty, false if not
    //size method that returns the size
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    //void push(T e) adds e toi the back of the stack
    public void push(T e){
        if(size == array.length){
            array = Arrays.copyOf(array, array.length*2);
        }
        array[size] = e;
        size++;
    }
    //T pop() removes the last element of the stack.
    //LIFO: Last In First Out
    public T pop(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        T save = array[size-1];//save the last element
        size--;//decrease the size
        return save;//return the saved last element.
    }
    //T peek()  returns the top of the stack without removing it.
    public T peek(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        return array[size-1];
    }
    //to string() return the content of the stack in the form [3, 4, ...]
    public String toString(){
        if(this.isEmpty()){
            return "[]";
        }
        String str = "[" + array[0];
        for(int i = 1; i < size; i++){
            str += ", " + array[i];
        }
        str += "]";
        return str;
    }



}
