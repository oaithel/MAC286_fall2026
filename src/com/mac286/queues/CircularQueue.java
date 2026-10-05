package com.mac286.queues;

import java.util.Arrays;

public class CircularQueue <T>{
    //reference to Array of T
    private T[] Q;
    //int size
    private int size;
    //first and last
    private int first, last;
    //default constructor, create an array of 5 Ts, size to 0, first and last to -1
    public CircularQueue(){
        Q = (T[]) new Object[5];
        size = 0;
        first = last = -1;
    }
    //getter for size
    public int size(){
        return size;
    }
    //isEmpty
    public boolean isEmpty(){
        return (size == 0);
    }
    //void add(T e) adds e to the back of the queue
    public void add(T e){
        if(this.isEmpty()){
            first = last = 0;
            Q[0] = e;
            size = 1;
            return;
        }
        if(size == Q.length){
            //TODO: Complete the resize.
            //resize;
        }
        //e should go to index: (last+1)%Q/length
        last = (last+1)%Q.length;
        Q[last] = e;
        size++;
    }
    //T remove(); removes the first and returns it
    public T remove(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        T save = Q[first];
        first = (first+1)%Q.length; //All indices move in a circular way
        size--;
        return save;
    }
    public T peek(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return Q[first];
    }
    //toString()
    public String toString(){
        if(this.isEmpty()){
            return "[]";
        }
        String str = "[" + Q[first];
        //deal with size-1 elements
        for(int i = 1; i < size; i++){
            str += ", " + Q[(i+first)%Q.length];
        }
        str += "]";
        return str;
    }

}
