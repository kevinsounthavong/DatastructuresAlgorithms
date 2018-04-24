class QueueNoCount
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public Queue(int s)
    {
        maxSize = s+1; // array is 1 cell larger than requested
        queArray = new long[maxSize]; 
        front = 0;
        rear = -1;
    }

    public void insert(long j)
    {
        if (rear == maxSize-1)
            rear = -1;
        queArray[++rear] = j;
    }

    public long remove()
    {
        long temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        return temp;
    }

    public long peek()
    {
        return queArray[front];
    }

    public boolean isEmpty()
    {
        return ((rear+1 == front || (front+maxSize-1 == rear)));
    }

    public boolean isFull()
    {
        return ((rear+2 == front) || (front+maxSize-2 == rear));
    }

    public int size() // assumes queue is not empty
    {
        if (rear >= front)  // contiguous sequence
        {
            return rear-front+1;
        }
        else // broken sequence
        {
            return (maxSize-front) + (rear+1);
        }
    }
}