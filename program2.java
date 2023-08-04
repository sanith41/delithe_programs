package training;
import java.util.*;
import java.io.*;

//program to find the nth prime number
public class program2 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0,f=0,prime=1;
	
	
	while(count<n) {
		prime++;
		f=0;
		for(int i=2;i<prime/2;i++) {
			if(prime%i==0) {
				f=1;
				break;
			}
		}
		if(f==0) {
			
			count++;
			
		}
		if(count==n)System.out.println(prime);
		}
	}

}
