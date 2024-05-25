package Important;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,6,3,4,1,7,9};
		//Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int len=a.length;
		
		for(int i=0;i<len-1;i++){   //number of passes
			for(int j=0;j<len-1;j++) {  //iterations
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}System.out.println(Arrays.toString(a));
		
	}

}
