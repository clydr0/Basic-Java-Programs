import java.io.*;
import java.util.*;

class Method1{
	static void large(int x, int y){
		if (x>=y)
			System.out.println("The largest value is: "+x);
		else 
			System.out.println("The largest value is: "+y);
	}
	static void large(int x, int y, int z){
		if (x>=y && x>=z)
			System.out.println("The largest value is: "+x);
		else if(y>=x && y>=z)
			System.out.println("The largest value is: "+y);
		else 
			System.out.println("The largest value is: "+z);
	}
}

public class Method{
public static void main(String[] args){
		int a, b, c, la, la2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of three no :");
	
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		Method1.large(a ,b);
		Method1.large(a, b, c);
		
	//	if(la>la2){
	//		System.out.println("The largest value is: "+la);
	//	}
	//	else{
	//		System.out.println("The largest value is: "+la2);
	//	}


	}
}

	
