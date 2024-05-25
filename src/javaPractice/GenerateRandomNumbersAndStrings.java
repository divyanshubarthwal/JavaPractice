package javaPractice;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1 -Random
		Random rand=new Random();
		
		int random_int=rand.nextInt(1000);
		System.out.println(random_int);
		
		double random_double=rand.nextDouble(); //range 0.0 and less than 1.0
		System.out.println(random_double);
		
		
		//Approach2- Math
		System.out.println(Math.random());
		
		//Approach 3- Apache commons-lang API
		
	}

}
