package Doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer>list=new DoublyLinkedList<Integer>();

        list.insertBeginning(5);
        list.insertBeginning(4);
        list.insertBeginning(3);
        list.insertBeginning(2);
        list.insertBeginning(1);

        list.display();
        System.out.println(" ");
        list.displayrev();
        System.out.println("");

        list.insertatposition(4,6);
        list.display();
        System.out.println(" ");
        list.displayrev();
//        System.out.println(" ");
//        System.out.print("Deletion at Begining: ");
//        list.DeletePosition(0);
//        list.display();
//        System.out.println(" ");
//        System.out.println("Reverse linkedlist");
//        list.reverselist();
//        list.display();
//        System.out.println(" ");
//        System.out.println("Search Index Operation: ");
//        list.index(2);

    }
}
