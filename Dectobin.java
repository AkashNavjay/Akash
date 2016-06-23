	import java.io.*;
	import java.util.Scanner;
        public class Dectobin
       {
        public static void main(String args[])
        {
	 Scanner in=new Scanner(System.in);
	 int num;
	 System.out.println("Enter the Decimal:");
	 num= in.nextInt();
	 dtob(num);
        }
        public static void dtob(int num)
	{
	 if(num>0)
         {
          int dec[]=new int[10];
	  int rem,index;
	  index = 0;
	  while(num>=1)
	  {
	   rem=num%2;
	   num=num/2;
	   dec[index++]=rem;
	  }
	  System.out.println("Binary value:");
	  for(int i=index-1;i>=0;i--)
	        {
	            System.out.print(dec[i]);
	        }
	 }
         else
          System.out.print("Cannot be converted:");
	}
       }
