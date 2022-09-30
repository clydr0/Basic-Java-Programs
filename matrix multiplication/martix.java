import java.io.*;
import java.util.*;
class Matrix{
	public static void main(String[] args){
		int a[][]={{1,2,3},{2,3,4},{3,4,5}};
		int b[][]={{3,4,5},{2,3,4},{1,2,3}};

		int c[][]=new int[3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=0;
				for(int k=0;k<3;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" "); 
			}
			System.out.println();
		}
	}
}
