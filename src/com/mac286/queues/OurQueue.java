package com.mac286.queues;

import java.util.Arrays;

/*
    The standard interface for a queue is:
    boolean isEmpty();
    int size();
    void add(T e); //adds e to the back of the queue
    T remove(); //removes the first in the queue and returns it. FIFO
    String toString();
    T peek(); // returns the first element of the queue (the to be removed), without removing it
*/
public class OurQueue <T>{
    private T[] array;
    private int size;
    public OurQueue(){
        array = (T[]) new Object[10];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public void add(T e){
        if(size == array.length){
            array = Arrays.copyOf(array, array.length*2);
        }
        array[size] = e;
        size++;
    }
    public T remove(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        T save = array[0];
        //bring all elements down by one index starting at 1 all the way to size -1
        for(int i =1; i < size; i++){
            array[i-1] = array[i];
        }
        size--;
        return save;
    }
    public T peek(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Queue empty");
        }
        return array[0];
    }
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
