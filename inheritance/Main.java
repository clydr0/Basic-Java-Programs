import java.util.*;
import java.io.*;

class Employee{
	int sal = 2000;
	int age = 20;
}

class Emp1 extends Employee{
	String name = "Joshua";
	String dprt = "Software";
	int id = 101;
}

class Emp2 extends Employee{
	String name;
	name=scan.nextLine();
	String dprt = "Hardware";
	int id = 102;
}

public class Main{
	public static void main(String[] args){
		Emp1 emplo1 = new Emp1();
		Emp2 emplo2 = new Emp2();
 		System.out.println("Details of employee 1 is : "+ emplo1.id +" "+ emplo1.name+" "+ emplo1.sal+" "+ emplo1.dprt+" "+ emplo1.age);
		System.out.println("\nDetails of employee 2 is : "+ emplo2.id+" "+emplo2.name+" "+ emplo2.sal+" "+ emplo2.dprt+" "+ emplo2.age);
	}
}

