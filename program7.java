package training;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		//int[] o=new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				for(int k=0;k<n;k++) {
					if(arr[i][k]==0||arr[k][j]==0) {
						arr[i][j]=0;
						
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
