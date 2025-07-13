package StackandQueue;

public class CircularQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front=0;
    int size=0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isfull()) {
            return false;
        }
        data[end++] = item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty");
        }
        int remove = data[front++];
        front=front% data.length;
        size--;
        // Here the end is decreases because of the shifting of elements
        return remove;
    }

    public int front() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public boolean isfull() {
        return size == data.length;
    }

    public boolean isempty() {
        return size == 0;
    }
    //Display the Elements just like the LinkedList
    public void display() throws Exception {
        if (isempty()) {
            System.out.print("Empty");
        }
//        if (isfull()) {
//            throw new Exception("Queue is full");
//        }
            int i = front;
            do {
                System.out.print(data[i] + "->");
                i++;
                i %= data.length;
            } while (i != end);
            System.out.print("END");

    }
}
