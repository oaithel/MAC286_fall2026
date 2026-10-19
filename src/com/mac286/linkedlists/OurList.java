package com.mac286.linkedlists;

import java.util.Arrays;

public class OurList <T>{
    private Node<T> head, tail;
    private int size;

public OurList(){
        head = tail = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    //adds e at the back of the list
    public void add(T e){
        //make a node with data e
        Node<T> n = new Node<>(e);
        if(this.isEmpty()){
            //make both head and tail refer to n
            head = tail = n;
            size = 1;
            return;
        }
        //set next of tail to new node
        tail.setNext(n);
        //update tail to new node
        tail = n;
        size++;

    }
    public T remove(){
        //removes the last element and returns it
        return null;
    }
    public void addLast(T e){
        this.add(e);
    }
    public T removeLast(){
        return this.remove();
    }
    //adds e at the head of the list
    public void addFirst(T e){
    //if empty just call add

        //make new node n
        //set next of n to head
        //set head to new node
        //increase size

    }
    //removes the first of the list and returns it
    public T removeFirst(){
        //if empty throw an exception
        //save data at head

    }

    //this adds e at specific index ind
    public void add(int ind, T e){

    }
    //remove element at index ind
    public T remove(int ind){


        return null;
    }
    //method that returns element at specific index.
    public T get(int ind){

        return null;
    }
    public void set(int ind, T e){

    }
    //TODO:
    public String toString(){
        //if empty return []
        if(this.isEmpty()){
            return "[]";
        }
        //create a string add to it [first element
        String str = "[" + head.getData();
        //Create temp reference to the second node
        Node<T> temp = head.getNext();
        while(temp != null){
            str += ", " + temp.getData();
            //move to the next node
            temp = temp.getNext();
        }
        str += "]";
        return str;
    }
}
