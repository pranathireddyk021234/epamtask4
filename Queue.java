import java.io.*;
import java.util.*;

public class Queue {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int f=0,r=0;
        for(int z=0;z<n;z++)
        {
            int q=sc.nextInt();
            if(q==1)
            {
                int p=sc.nextInt();
                a[r++]=p;
            }
            else if(q==2)
            {
                f++;
            }
            else if(q==3)
            {
                System.out.println(a[f]);
            }
        }
    }
}