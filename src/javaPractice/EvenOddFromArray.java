package javaPractice;

public class EvenOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,5,1,3,4,5,6,7,8,9,22};
		
		//Extracting even numbers
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" is even Number ");
			}else {
				System.out.println(a[i]+" is odd Number ");
			}
		}
	}

}