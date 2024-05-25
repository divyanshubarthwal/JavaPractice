package Important;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Need to be sorted first
		   /*     case1 key==Mid
				case2 key>mid   L=Mid+1;
				case3 key<mid   H=mid-1;
				*/
		Boolean flag=false;
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		//Approach 1
		/*int key=80;
		int l=0;
		int h=a.length-1;
		
		while(l<=h) {
			int mid=(l+h)/2;
			
			if(a[mid]==key) {
				System.out.println("Element Found");
				flag=true;
				break;
				
			}
			if(a[mid]<key) {
				l=mid+1;
			}
			if(a[mid]>key) {
				h=mid-1;
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found");
		}*/
		
		//Approach 2 : Arrays.binarySearch()
		
		System.out.println(Arrays.binarySearch(a,80));
		
	}

}
