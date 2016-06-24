import java.io.*;
import java.util.Scanner;
public class Factorial {
   
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,fac;
        System.out.println("Enter a Positive no:");
        n=in.nextInt();
        if(n>0)
        {
            fac=fact(n);                                    /*Invoking fact method*/
            System.out.println("Factorial:"+fac);
        }
        else
            System.out.println("Factorial Cannot Be Determined");
        
    }
    static int fact(int n)
    {
        if(n>=1)
            return n*fact(n-1);                                /*Recursively invoking fact*/
        else
            return 1;
    }
    
}
