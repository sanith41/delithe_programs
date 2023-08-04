package training;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		int[][] o=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				o[i][j]=arr[i][j];
				
			}
		}
		
		//int[] o=new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				for(int k=0;k<n;k++) {
					if(arr[i][k]==0||arr[k][j]==0) {
						o[i][j]=0;
						
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(o[i][j]);
				
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
