package com.mac286.binarysearchtrees;

public class BTreeTester {
    static void main() {
        BSTree<Integer> T = new BSTree<>();
        T.insert(25);
        T.insert(15);
        T.insert(10);
        T.insert(21);
        T.insert(18);
        T.insert(17);
        T.insert(16);
        T.insert(19);
        T.insert(22);
        T.insert(27);
        T.insert(26);
        T.insert(35);
        T.insert(30);
        T.insert(29);
        T.insert(31);
        T.insert(37);
        T.preOrderTraversal();
        T.inOrderTraversal();




    }
}
