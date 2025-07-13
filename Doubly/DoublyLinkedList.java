package Doubly;

public class DoublyLinkedList<T> {
    Node head;
    Node tail;

    class Node {
        T data;
        Node next;
        Node prev;

        public Node(T val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertBeginning(T val) {
        Node newnode = new Node(val);
        newnode.next = head;
        if (head == null) {

            tail = newnode;
        } else {
            head.prev = newnode;
        }
        head = newnode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node temp = head;
        System.out.println("Forward Connection");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null");

    }

    public void displayrev() {
        if (tail == null) {
            System.out.println("List is empty");
        }
        Node temp = tail;
        System.out.println("Backward Connection");

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.prev;
        }
        System.out.print("Null");


    }


    public void insertatposition(int pos, T val) {

        if (pos == 0) {
            insertBeginning(val);
            return;
        }
        Node newnode = new Node(val);
        Node temp = head;
        // We need to Iterate from the 1st index
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == null) {
                // Throw the new Error to give the instruction's
                throw new IllegalArgumentException("Invalid Position:-------> $$-----> " + pos);
            }
        }
        //reassign references
        newnode.next = temp.next;
        //Need to define temp.next.prev before temp because it cause collapse of reference of the temp.next
        newnode.prev = temp;
        if (temp == tail) {
            newnode.prev = tail;
            tail = newnode;
        } else {
            temp.next.prev = newnode;
        }
        temp.next = newnode;
    }


    //
    //To Delete Position of Node
    public void DeletePosition(int pos) {
        if (pos == 0) {
            // to delete the first index
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
}



