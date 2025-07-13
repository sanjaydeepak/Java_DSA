package Threading;

class Cake extends Thread {
    public void run() {
        try {

            System.out.println("Mixing the Ingredients: " + Cake.currentThread().getName());
            System.out.println("Baking the cake: " + Cake.currentThread().getName());
            System.out.println("Adding Toppings: " + Cake.currentThread().getName());
        } catch (Exception e) {
            System.out.println("Exception is caught ");
        }
    }

}

public class ThreadCake {
    public static void main(String[] args) {
        int cakecount = 3;

        for (int i = 1; i < cakecount; i++) {

            Cake c = new Cake();
            c.start();
//

        }

        Cake sample = new Cake();
        sample.start();
        System.out.println(sample.isAlive());
        try{
            sample.join();

        }catch(InterruptedException e){

        }
        System.out.println("Outside loop ");
        System.out.println(sample.isAlive());
    }

}


