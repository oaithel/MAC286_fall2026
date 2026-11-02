package com.mac286.binarysearchtrees;

public class BSTree <T extends Comparable<T>>{
    private class Node<D>{
        private D data;
        private Node<D> left, right;
        public Node(){
            data = null;
            left = right = null;
        }
        public Node(D d){
            data = d;
            left = right = null;
        }
        public D getData() {
            return data;
        }
        public void setData(D data) {
            this.data = data;
        }
        public Node<D> getLeft() {
            return left;
        }
        public void setLeft(Node<D> left) {
            this.left = left;
        }
        public Node<D> getRight() {
            return right;
        }
        public void setRight(Node<D> right) {
            this.right = right;
        }
        @Override
        public String toString() {
            return "" + data;
        }
    }

    private Node<T> root;
    private int size = 0;
    public BSTree(){
        root = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public void insert(T e){
        //create a Node with e
        Node<T> n = new Node<>(e);
        //if tree is empty set root to new node soze to 1 and return
        if(this.isEmpty()){
            root = n;
            size = 1;
            return;
        }
        //the tree is not empty.
        Node<T> temp = root;
        while(true){
            if(e.compareTo(temp.getData()) < 0) {
                if(temp.getLeft() == null){
                    //add thr node to the left of temp
                    temp.setLeft(n);
                    size++;
                    return;
                }
                //else go to the left
                temp = temp.getLeft();
            }else{
                if(temp.getRight() == null){
                    //add the node to the right of temp
                    temp.setRight(n);
                    size++;
                    return;
                }
                //there is a node on the right go there
                temp = temp.getRight();
            }
        }
    }
    public void preOrderTraversal(){
        System.out.println("---------PreOrder -------------");
        preOrder(root);
        System.out.println("\n-------------------------------");
    }
    private void preOrder(Node<T> n){
        if(n == null) {
            return;
        }
        //visit root
        System.out.print("  " + n);
        //explore the left
        preOrder(n.getLeft());
        //explore the right
        preOrder(n.getRight());
    }
    public void inOrderTraversal(){
        System.out.println("---------PreOrder -------------");
        inOrder(root);
        System.out.println("\n-------------------------------");
    }
    private void inOrder(Node<T> n){
        if(n == null) {
            return;
        }
        //explore the left
        inOrder(n.getLeft());
        //visit root
        System.out.print("  " + n);
        //explore the right
        inOrder(n.getRight());
    }


}
