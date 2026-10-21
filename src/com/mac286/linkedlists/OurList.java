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
        if(ind <0 || ind > size){
            throw new IndexOutOfBoundsException();
        }
        if(ind == 0){
            this.addFirst(e);
            return;
        }
        if(ind == size){
            //add at the back
            this.addLast(e);
            return;
        }
        //have temp refer to the first node.
        Node<T> temp = head;
        //move temp ind-1 times forward
        for(int i =0; i < ind-1; i++){
            temp = temp.getNext();
        }
        //make new node with e
        Node<T> n = new Node<>(e);
        //set next of new node to next of temp
        n.setNext(temp.getNext());
        //set next of temp to new node
        temp.setNext(n);
        //increase size.
        size++;
    }
    //remove element at index ind
    public T remove(int ind){
        //if index is invalid throw outofbounds exception
        if(ind < 0 || ind > size-1){
            throw new IndexOutOfBoundsException();
        }
        if(ind == 0){
            return this.removeFirst();
        }
        //have temp refer to the first node.
        Node<T> temp = head;
        //move temp ind-1 times forward
        for(int i =0; i < ind-1; i++){
            temp = temp.getNext();
        }
        //save the data of the node next of temp
        T save = temp.getNext().getData();
        //set next of temp to the next of next of temp.
        temp.setNext(temp.getNext().getNext());
        //if ind == size-1, update tail to temp
        if(ind == size-1){
            tail = temp;
        }
        //decrease size
        size--;
        //if size == 0 update head and tail
        if(size == 0){
            head = tail = null;
        }
        //return saved data.
        return save;
    }
    //method that returns element at specific index.
    public T get(int ind){
        //if index is invalid throw ourof bounds exception
        if(ind < 0 || ind > size-1){
            throw new IndexOutOfBoundsException();
        }
        //have temp refer to head
        //move temp forward ind times
        Node<T> temp = head;
        for(int i =0; i < ind; i++){
            temp = temp.getNext();
        }
        //return data at temp.
        return temp.getData();
    }
    public void set(int ind, T e){
        //if index is invalid throw ourof bounds exception
        if(ind < 0 || ind > size-1){
            throw new IndexOutOfBoundsException();
        }
        //have temp refer to head
        //move temp forward ind times
        Node<T> temp = head;
        for(int i =0; i < ind; i++){
            temp = temp.getNext();
        }
        //update data at temp to e.
        temp.setData(e);
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
