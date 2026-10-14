package com.mac286.linkedlists;
//Node to store any type T of data
public class Node <T>{
    private T data;
    //reference to the next Node
    private Node<T> next;
    //default constructor
    public Node(){
        data = null;
        next = null;
    }
    public Node(T d){
        data = d;
        next = null;
    }
    public Node(T d, Node<T> n){
        data = d;
        next = n;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public String toString(){
        return data.toString();
    }
}
