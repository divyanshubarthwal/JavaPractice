package javaPractice;

import java.util.Scanner;

public class Factorial {
//5! = 1*2*3*4*5=120
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		long factorial=1;
		
		for(int i=num;i>=1;i--) {
			factorial=factorial*i;
		}
		
		System.out.println(factorial);
	}

}
