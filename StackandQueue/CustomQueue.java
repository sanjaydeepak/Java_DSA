package StackandQueue;

public class CustomQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isfull()) {
            return false;
        }
         data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty");
        }
        int remove = data[0];
        // the Removal starts from the Zeroth Index
        for (int i = 1; i < end; i++) {
            //Shift the Elements to left
            data[i - 1] = data[i];
        }
        end--;
        // Here the end is decreases because of the shifting of elements
        return remove;
    }

    public int front() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public boolean isfull() {
        return end == data.length;
    }

    public boolean isempty() {
        return end == 0;
    }
//Display the Elements just like the LinkedList
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.print("END");
    }
}