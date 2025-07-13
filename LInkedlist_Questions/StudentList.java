package LInkedlist_Questions;

import java.util.*;
class StudentList {
    Node head;
    class Node
    {
        Node next;
        String roll;
        public Node(String roll)
        {
            this.roll=roll;
            this.next=null;
        }

    }
    StudentList()
    {
        head=null;
    }
    public void insertbegin(String roll)
    {
        Node newnode=new Node(roll);
        newnode.next=head;
        head=newnode;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.roll);
            temp=temp.next;
        }
    }
    public void deletetheprefix(String prefix)
    {
        Node current =head;
        Node prev=null;
        while(current!=null)
        {
            if(current.roll.startsWith(prefix))
            {
                if(prev!=null)
                {
                    prev.next=current.next;
                }else{
                    head=current.next;
                }
                current=current.next;
            }else
            {
                prev=current;
                current=current.next;
            }
        }
    }
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        StudentList list=new StudentList();
        for(int i=0;i<n;i++)
        {
            String roll=scan.nextLine();
            list.insertbegin(roll);
        }
        String prefix=scan.nextLine();
        list.deletetheprefix(prefix);
        list.display();
    }

}