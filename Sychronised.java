class Cakecounter{
    int cakecount=0;
    //If sychronized keyword removed the silmutaneosly count overlapped as one count
    public synchronized void Increment(){
        cakecount++;
    }
}
class Team implements Runnable{
    Cakecounter counter;// To increase the count simultaneously so object created in main function
    //Constructor
    Team(Cakecounter counter){
        this.counter=counter;
    }
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            counter.Increment();
        }
    }
}
public class Sychronised {
    public static void main(String[] args) {
        Cakecounter counter=new Cakecounter();
        Thread team1=new Thread(new Team(counter));
        Thread team2=new Thread(new Team(counter));
        team1.start();
        team2.start();
        try{
            team1.join();
            team2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.cakecount);
    }
}
