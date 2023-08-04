package training;

import java.util.ArrayList;
import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		int val1,val2;
		while(n1>0||n2>0) {
			if(n1>0) {
			val1=n1%10;
			n1=n1/10;
			arr1.add(val1);
			}
			if(n2>0) {
				val2=n2%10;
				n2=n2/10;
				arr2.add(val2);
				}
			
			
			
		}
		int i=0,j=0;
		int carry=0;
		
		ArrayList<Integer> o=new ArrayList<Integer>();
		int max=Math.max(arr1.size(),arr2.size());
		//int[] o=new int[max];
		while(i<max) {
			 
			int ans=arr1.get(i)+arr2.get(i)+carry;
			carry=0;
			
			if(ans>9) {
				carry=ans/10;
				ans=ans%10;
			
			}
			
			o.add(ans);
			i++;	
		}
		
		if(arr1.size()>arr2.size()) {
			for(j=i;j<arr1.size();j++) {
			o.add(arr1.get(j)+carry);
			carry=0;
			}
		}
		if(arr1.size()<arr2.size()) {
			for(j=i;j<arr2.size();j++) {
			o.add(arr2.get()+carry);
			carry=0;
			}
		}
		if(carry==1) {
			o.add(carry);
		}
		
		for(i=o.size()-1;i>=0;i--) {
			System.out.print(o.get(i)+" ");
		}
		
		
		
		
		

	}
}