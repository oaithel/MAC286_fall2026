package com.mac286.linkedlists;

public class NoteTester {
    public static void main(String[] args) {
        //create a Node N1 with value -2
        Node<Integer> N1 = new Node<>(-2);
        System.out.println("N1: " + N1);
        //Create a Node N2 with value -5 that is the next of N1
        Node<Integer> N2 = new Node<>(-5);
        System.out.println("N2: " + N2);
        N1.setNext(N2);
        //In one instruction, create a node N3 with value -7 and
        // make N1 the next of N3.
        Node<Integer> N3 = new Node<>(-7, N1);
        //change the value of N1 to -11 using reference to N3 only.
        //N3.getNext() is N1
        N3.getNext().setData(-11);
        System.out.println("N1: " + N1);
        //show the content of N2 using N3 only.
        //N2 is N1.getNext(), and N1 is N3.getNext() therefore
        //N2 is N3.getNext().getNext()
        System.out.println("N2: " + N3.getNext().getNext());
        //Rename N3/ create a reference to N3 call it first.
        Node<Integer> first = N3;
        //Rename N2/ create a refrence to N2 call it last
        Node<Integer> last = N2;
        //Create Node N4 with value -13 add it at the front of N3, make first refer to it
        Node<Integer> N4 = new Node<>(-13, first);
        first = N4;
        //create node N5 with value -8 and connect it to N2 as the last node.
        Node<Integer> N5 = new Node<>(-8);
        last.setNext(N5);
        last = N5;
        //Display all nodes one by one using only reference to first.
        Node<Integer> temp = first;
        int i = 0;
        System.out.println("Node" + i + ": " + temp);
        //move to the next node
        i++;
        System.out.println("Node" + i + ": " + temp.getNext());
        i++;
        System.out.println("Node" + i + ": " + temp.getNext().getNext());
        i++;
        System.out.println("Node" + i + ": " + temp.getNext().getNext().getNext());
        i++;
        System.out.println("Node" + i + ": " + temp.getNext().getNext().getNext().getNext());
       //We can use the above as follows:
        i = 0;
        System.out.println("Node" + i + ": " + temp);
        //move to the next node
        i++;
        temp = temp.getNext();
        System.out.println("Node" + i + ": " + temp);
        i++;
        temp = temp.getNext();
        System.out.println("Node" + i + ": " + temp);
        i++;
        temp = temp.getNext();
        System.out.println("Node" + i + ": " + temp);
        i++;
        temp = temp.getNext();
        System.out.println("Node" + i + ": " + temp);

        System.out.println("--------------Use a loop ----------");
        temp = first;
        i = 0;
        while(temp != null){
            System.out.println("Node" + i + ": " + temp);
            //go to the next
            temp = temp.getNext();
        }
//TODO: HW7
        //create Node N6 with value -6 add it to the list between N3 and N1.

        //Display all nodes one by one using only reference to first.
/* Later
        //remove Node N1 fro the list.

        //Display all nodes one by one using only reference to first.

        //remove the first node and update first.

        //Display all nodes one by one using only reference to first.

        //Remove the last and display all the nodes.

 */
    }
}
