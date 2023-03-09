import java.io.*;
import java.util.*;

public class ogstars{
	public static void main(String args[]){
		int i,j,k,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of the stars");
		n=scan.nextInt();
		for(i=0;i<=n;i++){
			for(j=n-i;j>=1;j--){
				System.out.print(" ");
			}
			for(k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

