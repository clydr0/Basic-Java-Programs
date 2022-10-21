import java.io.*;
import java.util.*;

public class Desorder{
  public static void main(String[] args){
    
    int x,y,z;
    Scanner scan = new Scanner(System.in);
    int arr[] = { 1,2,3,4,5,6,7,8,9};
    int n = arr.length;
    
    System.out.println("Before");
    for(int p=0; p<n; p++){
      System.out.print(" "+arr[p]);
    }





    System.out.println("\n After");

    for(int i=0; i<n/2 ; i++){
      int tmp =arr[i];
      arr[i] = arr[n-i-1];
      arr[n-i-1] = tmp;
    }

    for(int r=0; r<n; r++){
      System.out.print(" "+arr[r]);
    }
  }
}

