
import java.io.*;
import java.util.Scanner;
public class Swap 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int no1,no2,temp;
        System.out.println("Enter the first no:");    /* Input of first no */
        no1=in.nextInt();
        System.out.println("Enter the second no:");   /* Input of second no */
        no2=in.nextInt();
        System.out.println("Before Swapping");
        System.out.println("A="+no1);
        System.out.println("B="+no2);
        temp=no1;                                     /* Swapping of nos */
        no1=no2;
        no2=temp;
        System.out.println("After Swapping");
        System.out.println("A="+no1);
        System.out.println("B="+no2);
    }
}
