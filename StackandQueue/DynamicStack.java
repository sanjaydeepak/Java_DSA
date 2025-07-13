package StackandQueue;
//Unlike the Traditional Stack the size is increasing dynamically
public class DynamicStack extends Customstack{
    public DynamicStack()
    {
        super();
    }public DynamicStack(int size)
    {
        super( size);
    }
    //Everything is same except push we need to change dynamically size of Array
    public boolean push(int item) throws StackException
    {
        // This take's care of stack is full
        if(this.isfull())
        {
            //If the stack is full Multiplies by two
            int []temp=new int[data.length*2];
            // copy all new data form previous items
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
