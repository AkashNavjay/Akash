import java.io.*;
import java.util.Scanner;
public class Strrev {
    static String str;
    public static void rev(String s)
    {
        char s1[]=str.toCharArray();
        int j=str.length();
        j--;
        char temp;
        for(int i=0;i<s1.length/2;i++)
        {
            temp=s1[i];
            s1[i]=s1[j];
            s1[j]=temp;
            j--;
        }
        str=new String(s1);
        System.out.println("Reversed String:"+str);
    }
    public static void main(String args[])
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the String:");
     str=in.next();
     System.out.println("Original String:"+str);
     rev(str);
  }
}
