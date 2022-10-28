import java.util.Scanner;
class Employee{
	int id;
        String name;
        String desig;
        float salary;
}
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
                System.out.print("How many emplo: ");
                int n = scan.nextInt();
                Employee emp[] = new Employee[n];
                
                for (int i = 0; i < n; i++){
	                emp[i] = new Employee();
	                System.out.println("Enter " + (i + 1) + " Employee data :");
	                
        	        System.out.print("Enter employee id :");
	                emp[i].id = scan.nextInt();
	                
        	        System.out.print("Enter employee name :");
        	        emp[i].name = scan.next();
        	        
        	        System.out.print("Enter employee designation :");
        	        emp[i].desig = scan.next();
        	        
        	        System.out.print("Enter employee salary :");
        	        emp[i].salary = scan.nextFloat();
    		}
    		System.out.println("Employee Details are");
     		for (int i = 0; i < n; i++) {
     			System.out.println("\nemployee_id :" + emp[0].id + "\n name : " + emp[i].name + "\n dprt : " + emp[i].desig + "\n salary : " +emp[i].salary);
     		}
        }
}
