package javaPractice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Digits are "+ sum);
		
	}

}
