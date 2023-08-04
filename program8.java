package training;
import java.util.*;
import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> o=new ArrayList<Integer>();
		int k=sc.nextInt();
		for(int i=0;i<n;i++) {
			o.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			if(o.contains(k-o.get(i))) {
				System.out.println(o.get(i)+" "+(k-o.get(i)));
			}
		}
		

	}

}
