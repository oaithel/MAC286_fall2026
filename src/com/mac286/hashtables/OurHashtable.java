package com.mac286.hashtables;

import com.mac286.heaps.OurHeap;

public class OurHashtable <K extends Comparable<K>, T>{
    private class Node<KK, TT>{
        private KK key;
        private TT data;
        public Node(){
            key = null;
            data = null;
        }
        public Node(KK k, TT d){
            key = k;
            data = d;
        }
        public KK getKey() {
            return key;
        }
        public void setKey(KK key) {
            this.key = key;
        }
        public TT getData() {
            return data;
        }
        public void setData(TT data) {
            this.data = data;
        }
        @Override
        public String toString() {
            return key.toString() + "=" + data.toString();
        }
    }

    private Node<K, T>[] H;
    private int size;
    private float loadFactor;
    public OurHashtable(){
        H = new Node[10];
        size = 0;
        loadFactor = 0.75f;
    }
    public OurHashtable(int c){
        H = new Node[c];
        size = 0;
        loadFactor = 0.75f;
    }
    public OurHashtable(int c, float l){
        H = new Node[c];
        size = 0;
        loadFactor = Math.max(0.5f, Math.min(l, 1.0f));
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }

    private int hashFunction(K key){
        int num = Math.abs(key.hashCode());
        return (num%H.length);
    }
    public T put(K key, T d){
        //if table full resize()
        if(size == H.length){
            System.out.println("Table full, will resize later");
            return null;
        }
        //find the index where it's supposed to go.
        int index = hashFunction(key);
        while(H[index] != null){
            if(H[index].getKey().compareTo(key) == 0){
                //The key is already there, replace the value.
                T save = H[index].getData();
                H[index].setData(d);
                return save;
            }
            index = (index+1)%H.length;
        }
        //The item ddoes not exist, create a node add it to the index
        Node<K, T> n = new Node<>(key, d);
        H[index] = n;
        size++;
        return null;
    }
    public String toString(){
        //find the first nonempty cell
        int i = 0;
        while(H[i] == null){
            i = (i+1)%H.length;
        }
        String st = "{" + H[i].toString();
        int count = 1;
        i = (i+1)%H.length;
        while(count < size){
            if(H[i] != null){
                st += ", " + H[i].toString();
                count++;
                i = (i+1)%H.length;
                continue;
            }
            i = (i+1)%H.length;
        }
        st += "}";
        return st;
    }
}
