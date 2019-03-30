import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] s=new String[n];
        String y=sc.nextLine();
        for(int i=0;i<n;i++)
        {
        s[i]=sc.nextLine();
        //System.out.println(s[i]);
        }
        int m=sc.nextInt();
        String z=sc.nextLine();
        String []s1=new String[m];
        for(int i=0;i<m;i++)
        {
        s1[i]=sc.nextLine();
        //System.out.println(s1[i]);
        }
        for(int i=0;i<m;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(s1[i].equals(s[j]))
                c++;
            }
            System.out.println(c);
        }
    }
}