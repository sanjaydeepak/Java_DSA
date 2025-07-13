import org.w3c.dom.ls.LSOutput;

class Dad {
    char gender='M';
    int age=50;
    void call(){
        System.out.println("Father class");
    }
}
 class Daughter extends Dad{
    void call(){
        super.call();
        System.out.println(super.gender);
    }

}



public class superkeyword {
    public static void main(String[] args) {
        Daughter d=new Daughter();
        d.call();
    }

}