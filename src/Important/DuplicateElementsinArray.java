package Important;

import java.util.HashSet;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		/*	String arr[]= {"java","C","C++","Python","Java"};
		
		//Approach 1
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found Duplicate Element :"+arr[i]);
					flag=true;
				}
			}
		}if(flag==false) {
			System.out.println("Duplicate Element Not Found");
		}*/
		
		
		//Approach 2 : HashSet->Does not allow to add duplicates value
						
		HashSet <String>langs=new HashSet<String>();
		
		/*langs.add("Java");
		langs.add("Python");
		langs.add("C++");
		langs.add("Java");*/
		String arr[]= {"java","C","C++","Python","java","C"};
		
		for(String value:arr) {
			if(langs.add(value)==false) {
				System.out.println("Found Duplicate Element : "+ value);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Duplicate Element Not Found");
			
		}
		
	}

}
