import java.io.*;
import java.util.*;

class Method{
	static int Large(int x, int y, int z){
		if(x>=y && x>=z)
			return x;
		else if(y>=x && y>=z)
			return y;
		else 
			return z;
	}

	public static void main(String[] args){
		int a, b, c, large;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of three no :");
	
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		large=Large(a ,b ,c );
		System.out.println("The largest value is: "+large);
	}
}

	
