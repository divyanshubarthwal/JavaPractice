package javaPractice;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=1234567;
		int evencount=0;
		int oddcount=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("Total Number of evencount is "+evencount +" And oddcount is "+oddcount);
	}

}
