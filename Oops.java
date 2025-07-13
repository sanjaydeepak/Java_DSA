import java.util.*;

class Oops
{
    String name;
    int rollno;
    public  void display()
{
    System.out.println(name);
    System.out.println(rollno);
}

    public static void main(String[] args) {
       
        Oops obj1=new Oops();
        obj1.name="sanjay";
        obj1.rollno=72;
        obj1.display();
    }
}