package javaPractice;

public class MaxAndMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,40,30,44,59};
		
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Max is "+max +" Min is "+ min);
	}

}
