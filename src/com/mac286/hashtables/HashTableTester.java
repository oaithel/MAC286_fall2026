package com.mac286.hashtables;

import java.util.Hashtable;

public class HashTableTester {
    public static void main(String[] args) {
        OurHashtable<Integer, String> HT = new OurHashtable<>(20, 0.75f);
        HT.put(2, "Hi");
        HT.put(34, "Hello");
        HT.put(9, " Hola");
        HT.put(13, "sgSFIUY");
        System.out.println("Put returns: " + HT.put(102, "Bye"));
        System.out.println("HT: " + HT);
        //default capacity: 9= Hola, 102=Bye, 13=Bye, 2=Hi, 34=Hello
        //10 capacity 9= Hola, 34=Hello, 13=Bye, 102=Bye, 2=Hi
        //20 capacity 34=Hello, 13=Bye, 9= Hola, 102=Bye, 2=Hi
        System.out.println("put returns: " + HT.put(102, "ByeBye"));
        System.out.println("HT: " + HT);
    }
    //TODO: HW implement get method (read the slides the algo is there)
    public T get(K key){

        return null;
    }
}
