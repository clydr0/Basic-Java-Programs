import java.util.Arrays;
import java.io.*;

public class Sring{
	public static void main(String args[]){
		String[] cin = {"Foot","Key","Book","Ant","Ball"};

		int n = cin.length;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				if(cin[i].compareTo(cin[j])>0){
					String temp = cin[i];
					cin[i] = cin[j];
					cin[j] = temp;
				}
			}
		}

	System.out.println(Arrays.toString(cin));
		
	}
}
