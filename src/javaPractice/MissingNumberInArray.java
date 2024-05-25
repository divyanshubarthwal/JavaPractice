package javaPractice;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array should not have duplicate
		//Array no need to be sorted order
		//Values should be in range
		
		
		int a[]= {1,2,4,5,6};
		
		//1+2+4+5+6=18 sum1
		//1+2+3+4+5+6=21 sum2
		//sum2-sum1=3 is missing
		
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		int sum2=0;
		for(int i=1;i<=6;i++) {
			sum2+=i;
		}
		int missingnum=sum2-sum1;
		
		System.out.println(missingnum);
		
	}

}
