import java.util.*;
import java.io.*;

class Employee{
	int age;
	String name;
}

class Emp1 extends Employee{
	int emp_id;
	String dprt;
	int sal;
}


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("Enter the amount of emp");
		n=scan.nextInt();
	
		
		for(int i=0; i<n; i++){

		Emp1 emplo1 = new Emp1();
		System.out.println("enter the follng details age name");
        	emplo1.age=scan.nextInt();

	        emplo1.name=scan.nextLine();
		emplo1.name=scan.nextLine();

		System.out.println("enter the follng details emp_id dprt sal");
	        emplo1.emp_id=scan.nextInt();
        	
		emplo1.dprt=scan.nextLine();
		emplo1.dprt=scan.nextLine();

		emplo1.sal=scan.nextInt();
 		
		System.out.println("\t\tDetails of employee : Employee age Employee name  Employee id Employee dprt Employee sal");
		System.out.println("\t\tDetails of employee "+ n+1 +"  is : "+ emplo1.age +" "+ emplo1.name+" "+ emplo1.emp_id+" "+ emplo1.dprt+" "+ emplo1.sal+"\n\n");
		

		}
	}
}

