import java.io.*;
import java.util.*;

class Method{
	void large(int x, int y){
		if (x>=y)
			System.out.println("The largest value is: "+x);
		else 
			System.out.println("The largest value is: "+y);
	}
	void large(int x, int y, int z){
		if (x>=y && x>=z)
			System.out.println("The largest value is: "+x);
		else if(y>=x && y>=z)
			System.out.println("The largest value is: "+y);
		else 
			System.out.println("The largest value is: "+z);
	}
}

class Main{
public static void main(String[] args){
		int a, b, c, la, la2;
		Scanner scan = new Scanner(System.in);
		Method meth = new Method();
		System.out.println("Enter the values of three no :");
	
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		meth.large(a ,b);
		meth.large(a, b, c);
	}
}
