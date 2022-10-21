import java.util.*;
import java.io.*;

class Banking{
	boolean quit = false;
	String depo_name, acc_type;
	Scanner scan = new Scanner(System.in);
	int accno, amnt, bal;
	Banking(String name, int no, String type, int amt){
		depo_name = name;
		accno = no;
		acc_type = type;
		amnt = amt;
		bal = amt;
	}

	void createaccnt(){
		System.out.println("enter name :");
		depo_name = scan.nextLine();
		System.out.println("enter acc number :");
		accno = scan.nextInt();
		System.out.println("enter acc type :");
		acc_type = scan.nextLine();
		System.out.println("enter amount :");
		amnt = scan.nextInt();
		quit = false;
	}

	void deposit(){
		System.out.println("enter acc number :");
		accno = scan.nextInt();

		System.out.println("enter the amount to be deposited :");
		amnt = scan.nextInt();
		bal = bal+amnt;
	}

	void withdrawal(){
		System.out.println("enter acc number :");
		accno = scan.nextInt();
		System.out.println("enter amnt to be withdrawn :");
		amnt = scan.nextInt();
		bal = bal-amnt;
	}

	void display(){
		System.out.println("enter acc number :");
		accno = scan.nextInt();
		System.out.println(":"+accno+" : : "+acc_type+" : : "+depo_name+" : : "+bal+":");
	}

}
public class Bank{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Banking b1 = new Banking("joshua",100,"saving",2000);
		//Banking b2 = new Banking();
		System.out.println("Enter your choice :");
		System.out.println("1. Create Account \n2. Deposite \n3.Withdrawn \n4. Display");
		
		int x;
		x=scan.nextInt();
		boolean quit = false;
		//do{
		switch(x){
			case 1:
				b1.createaccnt();
				break;
			case 2:
				b1.deposit();
				break;
			case 3:
				b1.withdrawal();
				break;
			case 4:
				b1.display();
				break;
			case 5: 
				quit = true;
				break;
			default:
				System.out.println("Invalid");
				break;
		}
		//}while(!quit);
	
	}
}

