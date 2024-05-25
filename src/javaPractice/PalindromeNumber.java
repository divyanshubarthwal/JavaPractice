package javaPractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		int originalno=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(originalno==rev) {
			System.out.println("PalindromeNumber");
			
		}
		else {
			System.out.println("Not a palindrome");
			
		}
		
	}

}
