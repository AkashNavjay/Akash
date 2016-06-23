	import java.io.*;
	import java.util.Scanner;
  public class Exten1 {
  public static void main(String args[])
	    {
	    	Scanner in=new Scanner(System.in);
	        String name;
	        int flg=0;
	        System.out.println("Enter the file name:");
	        name=in.next();
	        char[] a = name.toCharArray();
	        int l=name.length();
	        System.out.println("Extension:");
	        for(int i=0;i<l;i++)
	        {
	        	if(a[i]=='.')
	        		{
	        		 flg=1;
	        		 i++;
	        		}
	        	  if(flg==1)
	        		System.out.print(a[i]);
	        }
	     	}
	    }
