
import java.io.*;
import java.util.Scanner;
public class Armstrong {
public static void main(String args[])
 {
    Scanner in=new Scanner(System.in);
    int num,temp,digit,sum=0;
    System.out.println("Enter the no:");
    num=in.nextInt();                       
    temp=num;
    while(temp!=0)
    {
        digit=temp%10;                  /*Armstrong No Check*/
        sum=sum+digit*digit*digit;
        temp=temp/10;
     }
     if(num==sum)
         System.out.println("Armstrong Number");
     else
         System.out.println("Not an Armstrong Number");
 }
}
