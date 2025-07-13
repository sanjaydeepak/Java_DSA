public class polymorphism {
    public static void main(String[] args) {
        Method obj=new Method();
        obj.display();
        obj.display(5,6);

    }
}
class Method
{
    void display(){
        System.out.println("I am void");
    }
    void display(int a,int b){
      //  System.out.println(a);
        if(a>b){
            System.out.println("A is Larger");
        }else if(a<b){
            System.out.println("B is Larger");
        }else{
            System.out.println("Invalid");
        }

    }
}
