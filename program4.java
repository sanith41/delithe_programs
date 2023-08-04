package training;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// insertion sort
		int temp;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		arr[0]=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			arr[i]=sc.nextInt();
			int j=i;
			while(j>=1&&arr[j]<arr[j-1]) {
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
			
		}
		for(int i=0;i<n;i++)System.out.println(arr[i]);
		

	}

}
