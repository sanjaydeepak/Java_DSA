package StackandQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

queue.remove();
        queue.display();
        queue.insert(90);
        System.out.println();
        queue.display();

    }
}