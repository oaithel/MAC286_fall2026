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
public class OurArray <T>{
    //declare a variable for an array of integers
    private T[] array;
    //declare a variable for size
    private int size;
    //default constructor, create an array of 10 integers. Set size to 0
    public OurArray() {
        array = (T[]) new Object[10];
        size = 0;
    }
    //constructor that accepts an initial capacity for the array. Create an array
    //of that capacity and set size to 0
    public OurArray(int c) {
        array = (T[]) new Object[c];
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
        T save = array[size-1];//save the last element
        size--;//decrease the size
        return save;//return the saved last element.
    }
    public void addLast(T e){
        this.add(e);
    }
    public T removeLast(){
        return this.remove();
    }
    public void addFirst(T e){
        //if full resize
        if(size == array.length){
            T[] newArray = (T[]) new Object[array.length*2];
           for(int i = 0; i < size; i++){
               newArray[i] = array[i];
           }
           array = newArray;
        }
        //push all elements up by one location starting at size-1 down to 0
        for(int i = size-1; i >= 0; i--){
            array[i+1] = array[i];
        }
        //add e at index 0
        array[0] = e;
        //increase the size
        size++;
    }
    public T removeFirst(){
        //if empty throw an exception
        if(this.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        //save the first element
        T save = array[0];
        //push all elements down by one location starting at index 1 all the way up
        //to index size-1
        for(int i = 1; i < size; i++){
            array[i-1] = array[i];
        }
        //decrease the size
        size--;
        //return the saved element.
        return save;
    }

    //TODO: this adds e at specific index ind
    public void add(int ind, T e){
        if(size == array.length){
            array = Arrays.copyOf(array, array.length*2);
        }
        //if ind is not valid index, index >= 0 and index <= size
        //throw exception
        if(ind < 0 || ind > size){
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        //push all elements up by one location starting from the last
        //all the way down to index ind.
        for(int i = size-1; i >= ind; i--){
            array[i+1] = array[i];
        }
        //add e at index ind
        array[ind] = e;
        //increase the size
        size++;
    }
    //TODO: remove element at index ind
    public T remove(int ind){
        //if index ind is not valid throw an exception. index >= 0 and index < size
        if(ind < 0 || ind >= size){
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        //save element at index ind
        T save = array[ind];
        //push all elements down by one location starting at index (ind+1) all the way up
        //to index size-1
        for(int i = ind+1; i < size; i++){
            array[i-1] = array[i];
        }
        //decrease size
        size--;
        //return saved element.
        return save;
    }
    //TODO: method that returns element at specific index.
    public T get(int ind){
        //if the index is invalid throw exception
        if(ind < 0 || ind >= size){
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        //return the element at index ind.
        return array[ind];
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
