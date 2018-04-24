import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
// for I/O

class ReverseApp
{
    public static void main(String[] args) throws IOException
    {
        String input, output;

        while(true)
        {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();    // read a string from keyboard

            if(input.equals("")) // quit if [Enter]
                break;
            
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev(); // use it
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}