package circular_list;

public class Cl {

    Node head;
    Node tail;
    class Node{
        int data;
       Node next;
       Node prev;

      public  Node(int val)
       {
           data=val;
           this.next=null;
           this.prev=null;
       }
    }
    void Insert(int val)
    {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
            tail = newnode;
            head.next = head;
            head.prev = head;
        } else {
            newnode.prev = tail;
            newnode.next = head;
            tail.next = newnode;
            head.prev = newnode;
            tail = newnode;
        }
    }

    void deletion(int val)
    {
        Node current=head;
        if(head==null)
        {
            return;
        }
        if(head==tail && head.data==val){
            head=null;
            tail=null;
            return;
        }
        //To deletes the head
        if(head.data==val){
           head=head.next;
           head.prev=tail;
           tail.next=head;
           return;
        }
        do{
            if(current.data==val) {
                current.prev.next = current.next;

                current.next.prev = current.prev;
                if(current==tail){
                    tail=current.prev;
                }
                return;
            }
            current=current.next;
            }while(current!=head);
    }
    void display()
    {
        Node temp=head;
        if(head!=null)
        {
            do{
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }while(temp!=head);
            System.out.print("Head");
        }
    }
}
