class Animal{
    int noLegs=4;
    static void eat(){
        System.out.println("I am eating");
    }
    static void walk(){
        System.out.println("I am walking");
    }

}
class Dog extends Animal{
    boolean canBark=true;


    public void  special(boolean canBark){
        System.out.println(canBark);
    }


}
class Human extends Animal{
    boolean think=false;
    public void sense(boolean think){
        if(think){
            System.out.print("You are Human");
        }else{
            System.out.print("You are not a Human.Your'e a monster");
        }
    }
}
class Call{
    public static void main(String []args){
      Dog obj=new Dog();
        obj.eat();
        obj.walk();
        obj.special(obj.canBark);
Human obj1=new Human();
        obj1.sense(obj1.think);
    }
}