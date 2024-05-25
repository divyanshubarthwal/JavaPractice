package javaPractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt(); //1234
		
	// 1. Using Algorithm
		
	/*	int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}*/
		
	//2 . Using StringBuffer	
		//Number into string format and pass to Stringbuffer 
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		
		System.out.println("Reverse number is :"+ rev);
		
	//3. Using StringBuilder Method
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev2=sb1.reverse();
		System.out.println("Reverse number is :"+ rev2);
		
		
		
		
	}

}
