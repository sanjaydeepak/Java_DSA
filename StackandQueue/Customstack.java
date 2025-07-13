package StackandQueue;

class Customstack {
    protected int[]data;
    public static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public Customstack()
    {
        this(DEFAULT_SIZE);
    }
    public Customstack(int size)
    {
        this.data=new int [size];
    }
    public boolean push(int item) throws StackException
    {
        if(isfull())
        {
            throw new StackException("Stack is full");
            //return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException
    {
        if(isempty())
        {
            throw new StackException("Stack is empty can't pop !!!");
        }
        return data[ptr--];
    }
    public int peek() throws StackException
    {
     if(isempty())
     {
         throw new StackException("Can't peek the stack is empty");
     }
     return data[ptr];
    }
    public boolean isfull()
    {
        return ptr==data.length-1;
    }
    public boolean isempty()
    {
        return ptr==-1;
    }
}