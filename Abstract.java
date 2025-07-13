abstract class computer
{
    abstract void turnoff();
    abstract void turnon();
}
class Hp extends computer{
    void turnon(){
        System.out.println("Turning on");
    }
    void turnoff(){
        System.out.println("Turning off-Hp");
    }
}
class Dell extends computer{
    void turnon(){
        System.out.println("Turining on");
    }
    void turnoff(){
        System.out.println("Turning off-dell");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Hp obj=new Hp();
        obj.turnon();
        obj.turnoff();
        Dell obj1=new Dell();
        obj1.turnon();
        obj1.turnoff();
    }
}
