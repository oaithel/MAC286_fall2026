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
        if(this.isEmpty()){
            H[0] = e;
            size = 1;
            return;
        }
        //add e at index size.
        H[size] = e;
        //heapify at index size
        heapify(size);
        //increase size and return;
        size++;
    }
    private void heapify(int index){
        if(index <= 0) {
            return;
        }
        //find the index of the parent: parent
        int parent = (index-1)/2;
        //if key at index is smaller than ket at parent
        if(H[index].compareTo(H[parent]) < 0) {
            //swap element at index with element at parent.
            T temp = H[index];
            H[index] = H[parent];
            H[parent] = temp;
            //heapify at parent
            heapify(parent);
        }
    }
    //TODO: HW10
    public T poll(){
        //if empty throw an outofbounds exception

        //if there is only one, set size to 0 and return element at 0

        //if not save element at 0
        //copy element at size-1 into index 0
        //decrease size.
        //reheapify
    }
    //TODO: HW10
    private void reheapify(int index){

        //if no children return.
        //find the smallest of the children of index.
        //if the key at index is larger than the smallest of the children,
            //swap the element at index and the smallest child.
            //reheapify at the child.
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
