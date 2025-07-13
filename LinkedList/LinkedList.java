package LinkedList;
public class LinkedList <T>  {
    Node head;
    class Node{
        T data;
        Node next;
        public Node(T val){
            data=val;
            next=null;
        }
    }
    LinkedList(){
        head=null;
    }
    public void insertBeginning(T val) {
        Node newnode = new Node(val);
//         Node temp=head;
        // No need of if condition jus for better understanding
        newnode.next = head;
        head = newnode;
//        if (head == null) {
//            head = newnode;
//        } else {
//            newnode.next = head;
//            head = newnode;
//        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null");

        }
        public void insertatposition(int pos,T val)
        {

            if(pos==0){
                insertBeginning(val);
                return;
            }
                Node newnode=new Node(val);
                Node temp=head;
                // We need to Iterate from the 1st index
                for(int i=1;i<pos;i++) {
                    temp=temp.next;
                    if(temp==null)
                    {
                        // Throw the new Error to give the instruction's
                        throw new IllegalArgumentException("Invalid Position:-------> $$-----> "+pos);
                    }
                }

                newnode.next=temp.next;
                temp.next=newnode;
        }
        //To Delete Position of Node
        public void DeletePosition(int pos){
          if(pos==0){
              // to delete the first index
              head=head.next;
              return;
          }
         Node temp=head;
         Node prev=null;
            for (int i = 1; i <=pos ; i++) {
                prev=temp;
        temp=temp.next;
            }
            prev.next=temp.next;
    }
    public void deletionAtBegining(){
        if(head==null)
        {
            throw new IndexOutOfBoundsException("List is empty");
        }
        head=head.next;

    }
    public void index(T val)
    {
        Node temp=head;
        int  index=0;
        while(temp!=null)
        {
            if(temp.data.equals(val)){
                System.out.println("Index "+index+" Value "+val);
                return ;
            }
            temp=temp.next;
            index++;
        }

    }
       public void reverselist()
       {
           Node prev=null;
           Node current=head;
           Node next=head.next;// To save the next Node
           while(current!=null){
               next=current.next;
               current.next=prev;//To change the direction of the
               prev=current;
               current=next;
           }
           // last element take as the null where it is store as the head
           head=prev;
       }
    }
