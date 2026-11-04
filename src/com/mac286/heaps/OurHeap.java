package com.mac286.heaps;

import com.mac286.linkedlists.OurList;

public class OurHeap <T extends Comparable<T>>{
    private T[] H;
    private int size;

    public OurHeap(){
        H = (T[]) new Comparable[10];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public void add(T e){
        //if empty then add e at index 0 and set seize to 1, return.

        //add e at index size.
        //heapify at index size

        //increase size and return;
    }
    private void heapify(int index){
        if(index <= 0)
            return;
        //find the index of the parent: parent
        //if key at index is smaller than ket at parent
            //swap element at index with element at parent.
            //heapify at parent
        //else just return, done heapifying
    }
    public String toString(){
        if (this.isEmpty()){
            return "[]";
        }
        String st = "[" + H[0].toString();
        for(int i = 1; i < size; i++){
            st += ", " + H[i].toString();
        }
        st += "]";
        return st;
    }
}
