package Important;

import java.util.Scanner;

public class CountTheWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();  //Welcome to JAVA
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
			}
		}System.out.println(count);
	}

}
