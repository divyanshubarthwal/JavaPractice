package javaPractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sc.next();
		String orgStr=str;
		
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(orgStr.equals(rev)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a Palindrome String");
		}
		
	}

}
