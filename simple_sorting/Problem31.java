class Problem31
{
    public static void main(String[] args)
    {
        int maxSize = 10; // array size
        ArrayBub arr;       // ref to array
        arr = new ArrayBub(maxSize);
        
        for(int i = 10; i > 0; i--)
        {
            arr.insert(i);
        }
        /*
        for(int i = 99999; i > 0; i--)
        {
            arr.insert(i);
        }*/
        /*
        for (int j=0; j<maxSize; j++)
        {
            long n = (long) (Math.random()*(maxSize-1));
            arr.insert(n);
        }*/
        /*
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        */
        //long startTime = System.nanoTime();
        arr.display();  // display items
    
        arr.biBubbleSort();   // bubble sort them
    
        arr.display();
        //long endTime = System.nanoTime();

        //long duration = (endTime - startTime);
        //double seconds = (double)duration/1000000000.0;


        //System.out.println("BubbleSort Duration: " + seconds);
    }
}