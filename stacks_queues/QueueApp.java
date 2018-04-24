class QueueApp
{
    public static void main(String[] args)
    {
        Queue theQueue = new Queue(5); // queue holds 5 items

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();      // remove 3 items
        theQueue.remove();          // (10,20,30)
        theQueue.remove();

        theQueue.insert(50);    // inserts 4 more items
        theQueue.insert(60);        // (wraps around)
        theQueue.insert(70);
        theQueue.insert(80);

        // remove and display all items
        while(!theQueue.isEmpty())
        {
            long n = theQueue.remove(); // (40, 50, 60, 70, 80)
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.print(" ");
    }
}