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
        return remove(size-1);
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
        if(this.isEmpty()){
            this.add(e);
            return;
        }
        //make new node n

        Node<T> n = new Node<>(e);
        //set next of n to head
        n.setNext(head);
        //set head to new node
        head = n;
        //increase size
        size++;

    }
    //removes the first of the list and returns it
    public T removeFirst(){
        //if empty throw an exception
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        //save data at head
        T save = head.getData();
        head = head.getNext();
        size--;
        if(size == 0){
            head = tail = null;
        }
        return save;
    }
    //TODO: HW 8 complete the code and test with your own data.
    //this adds e at specific index ind
    public void add(int ind, T e){
        //if index is not valid, throw outof bounds exception

        //have temp refer to the first node.
        //move temp ind-1 times forward

        //make new node with e
        //set next of new node to next of temp

        //set next of temp to new node
        //increase size.
    }
    //remove element at index ind
    public T remove(int ind){
        //if index is invalid throw outofbounds exception

        //have temp refer to head
        //move temp forward ind-1 times
        //save the data of the node next of temp
        //set next of temp to the next of next of temp.
        //if ind == size-1, update tail to temp
        //decrease size
        //if size == 0 update head and tail
        //return saved data.

        return null;
    }
    //method that returns element at specific index.
    public T get(int ind){
        //if index is invalid throw ourof bounds exception
        //have temp refer to head
        //move temp forward ind times
        //return data at temp.
        return null;
    }
    public void set(int ind, T e){
        //if index is invalid throw ourof bounds exception
        //have temp refer to head
        //move temp forward ind times
        //update data at temp to e.
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
