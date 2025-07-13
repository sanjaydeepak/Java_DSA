package circular_list;

public class Main {
    public static void main(String[] args) {
        Cl list =new Cl();
        list.Insert(4);
        list.Insert(3);
        list.Insert(2);
        list.Insert(1);
        list.display();
        System.out.println("\nDeletion");
        list.deletion(1);
        list.display();

    }
}