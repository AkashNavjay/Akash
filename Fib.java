import java.io.*;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[])
    {
        
        try
        {
            Scanner in=new Scanner(System.in);
            int n,count,a=0,b=1,c;
            System.out.println("Enter the range:");
            n=in.nextInt();
            System.out.println("Fibonacci Series");
            System.out.println(a+"\n"+b);
            for(count=0;count<n;count++)
            {
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}