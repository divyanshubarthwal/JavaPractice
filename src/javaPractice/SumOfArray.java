package javaPractice;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,2,4,6,7,8};
		
		int sum=0;
		/*for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}*/
		
		//Enhanced for Loop
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println(sum);
	}

}
