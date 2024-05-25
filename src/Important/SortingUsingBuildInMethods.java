package Important;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingBuildInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {30,40,10,55,12,33,113,452};
		//int -> primitive Integer->Non Primitive
		//System.out.println(Arrays.toString(a));
		
		// Approach 1
		/*Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));*/
		
		//Approach 2
		/*Arrays.sort(a);
		System.out.println(Arrays.toString(a));*/
		
		//Approach 3
		//Reverse Descending order
		//int -> primitive Integer->Non Primitive
		Integer a[]= {30,40,10,55,12,33,113,452};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}

}
