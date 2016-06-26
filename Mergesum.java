
package array1;
import java.io.*;
import java.util.Scanner;
public class Array1 {
    static int c[]=new int[20];
    static int count=0;
    public static void getinput(int x[],int n)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            x[i]=in.nextInt();
        }
    }
    public static void merge(int a[],int b[],int n,int m)
    {
        int sum=0;
    
        for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
           if(a[i]==b[j])
           {
               push(a[i]);
               count++;
               sum=sum+c[i-1];
           }
         
          }
      
      }
        display(c,count);
        System.out.println("Sum is:"+sum);
    }
    public static void push(int x)
    {
        c[count]=x;
    }
    public static void display(int x[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(x[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,m,i,j;
        int a[]=new int[20];
        int b[]=new int[20];
        System.out.println("Enter the Range of Array A");
        n=in.nextInt();
        getinput(a,n);
        System.out.println("Enter the Range of Array B");
        m=in.nextInt();
        getinput(b,m);
        System.out.println("Array A");
        display(a,n);
        System.out.println("Array B");
        display(b,m);
        System.out.println("Merge A and B and Sum");
        merge(a,b,n,m);
    }
}
