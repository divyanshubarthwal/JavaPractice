package javaPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Using + (String concatination) Method
		
		String str="ABCD";
		String rev="";
		
	/*	int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}*/
		//System.out.println("Reverse is "+ rev);
	
//2. Using character Array
	
	/*char a[]=str.toCharArray();
	int len=a.length;
	
	for(int i=len-1;i>=0;i--) {
		rev=rev+a[i];
	}*/
		
//3. Using String Buffer
		
		StringBuffer sb=new StringBuffer(str);
		
	System.out.println("Reverse is "+ sb.reverse());
	
	}
}
