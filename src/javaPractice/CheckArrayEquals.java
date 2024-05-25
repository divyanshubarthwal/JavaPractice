package javaPractice;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		//Approach 1
		
		/*boolean status=Arrays.equals(a,b);
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}*/
		
		
		//Approach 2
		
		boolean status=false;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					status=true;
				}else {
					status=false;
				}
			}
		}else {
			status=false;
		}
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are  Not equal");
		}
	}

}
