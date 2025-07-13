interface Father{
    abstract  void call();
    abstract void talk();
        }
        interface Mother{
    abstract  void call();
    abstract void talk();
    abstract void sing();
        }
public class Interface implements Father,Mother{
    public void call (){
        System.out.println("Calling");
    }
    public void talk(){
        System.out.println("Talking");
    }
    public void sing(){
        System.out.println("Singing");
    }

    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.call();
        obj.talk();
        obj.sing();
    }

}
