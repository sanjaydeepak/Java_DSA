package LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<Integer>();

        list.insertBeginning(5);
        list.insertBeginning(4);
        list.insertBeginning(3);
        list.insertBeginning(2);
        list.insertBeginning(1);

        System.out.println("");
        System.out.print("Original Linked List: ");
     list.insertatposition(1,6);
        list.display();
        System.out.println(" ");
        System.out.print("Deletion at Begining: ");
       list.DeletePosition(0);
        list.display();
        System.out.println(" ");
        System.out.println("Reverse linkedlist");
        list.reverselist();
        list.display();
        System.out.println(" ");
        System.out.println("Search Index Operation: ");
        list.index(2);

    }
}
