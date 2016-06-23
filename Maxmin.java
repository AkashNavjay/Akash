
import java.io.*;
import static java.lang.System.exit;
import java.util.Scanner;
public class Maxmin {
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int a[]=new int[25];
    int temp,n;
    System.out.println("Enter the array index:");
    n=in.nextInt();
    if(n>0)
    {
    System.out.println("Enter the nos:");
    for(int i=0;i<n;i++)
     {
         a[i]=in.nextInt();
     }
     for(int i=0;i<n;i++)
     {
         for(int j=i;j<n;j++)
         {
             if(a[i]>a[j])
             {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
      }
    }
    else
    {
        System.out.println("Array Out Of Bound");
        exit(0);  
    }
     System.out.println("Max+Min:");
     System.out.print(+a[0]+a[n-1]);
 }
}
