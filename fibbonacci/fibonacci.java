import java.io.*;
import java.util.*;
class fib
{
public static void main(String[] args)
 {
 int t1,t2,t3,i,n;
 Scanner s1=new Scanner(System.in);
 System.out.print("enter upto which number");
 n=s1.nextInt();
 t1=0;
 t2=1;
 for(i=0;i<=n-1;i++)
 {
 System.out.println(t1);
 t3=t1+t2;
 t1=t2;
 t2=t3;
 }
 }
 }
