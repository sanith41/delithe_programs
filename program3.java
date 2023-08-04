package training;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// prime numbers in a range
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		for(int i=2;i<n;i++) {
			f=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					f=1;
					
					}
			}
			if(f==0) {
				System.out.println(i);
			}
		}

	}

}
