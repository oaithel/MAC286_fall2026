package com.mac286.arrays;
/*
Design a class OurArray that has the following properties:
- A member array of integers
- A variable size that keeps track of the number of elements added to the array
- A default constructor that creates an array of 10 elements and sets size to 0
- A getter fo size (int size() returns the size of the array)
- A method boolean isEmpty() returns true if the array is empty and false if not.
- A method void add(int e) adds element e to the end of the array (index size)
- A method toString() that returns the content of the array in the form [-2, -5, -7, -8]
- A method int remove() that removes the last element (index size-1) and returns it.
- A method int get(int i) returns the element at index i, if i is valid index, otherwise
it throws an exception.

- Write a main where you test your class.
 */
import java.util.Arrays;
public class OurArray {
    //declare a variable for an array of integers
    private int[] array;
    //declare a variable for size
    private int size;
    //default constructor, create an array of 10 integers. Set size to 0
    public OurArray() {
        array = new int[10];
        size = 0;
    }
    //constructor that accepts an initial capacity for the array. Create an array
    //of that capacity and set size to 0
    public OurArray(int c) {
        array = new int[c];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public void add(int e){
        if(size == array.length){
           array = Arrays.copyOf(array, array.length*2);
        }
        array[size] = e;
        size++;
    }
    public int remove(){
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        int save = array[size-1];//save the last element
        size--;//decrease the size
        return save;//return the saved last element.
    }
    public void addFirst(int e){
        //if full resize
        //push all elements up by one location starting at size-1 down to 0

        //add e at index 0

        //increase the size
    }
    public int removeFirst(){
        //if empty throw an exception

        //save the first element
        //push all elements down by one location starting at index 1 all the way up
        //to index size-1
        //decrease the size
        //return the saved element.
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
