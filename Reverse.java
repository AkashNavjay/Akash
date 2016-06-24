import java.io.*;
import java.util.Scanner;

public class Reverse {
   public static void main(String arg[]) 
   {
       Scanner in=new Scanner(System.in);
       int num,reverse=0,digit;
       System.out.println("Enter the no:");
       num=in.nextInt();
       System.out.println("Original No:"+num);
       while(num!=0)
       {
           digit=num%10;
           num=num/10;
           reverse=reverse*10+digit;
       }
       System.out.println("Reverse No:"+reverse);
   }
}
