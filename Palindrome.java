import java.io.*;
import java.util.Scanner;
public class Palindrome {
 public static void main(String args[])
 {
     Scanner in=new Scanner(System.in);
     int num,temp,digit,rev=0;
     System.out.println("Enter the no:");
     num=in.nextInt();
     temp=num;
     while(temp!=0)
     {
         digit=temp%10;
         temp=temp/10;
         rev=rev*10+digit;
     }
     if(num==rev)
     {
         System.out.println("Palindrome");
     }
     else
     {
         System.out.println("Not a Palindrome");
     }
     
 }
}
