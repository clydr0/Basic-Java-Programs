import java.io.*;
import java.util.*;

public class Freq{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string");
    String x = scan.nextLine();
    
    System.out.println("Enter the letter for which to find the freq :");
    String y = scan.nextLine();

    int n = x.length();
    int m = x.replace(y,"").length();
    int total= n-m;
    System.out.println("The no of occurance is : "+total);
  }
}
