package javaPractice;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using ternary operator
		int a=10,b=20,c=13;
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest);
	}

}
