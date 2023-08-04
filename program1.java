package training;

import java.util.Scanner;

public class program1 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1||n==2)System.out.print("prime");System.exit(0);
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(" not prime");
				System.exit(0);
			}
		}
		System.out.print("prime");
	}

}
