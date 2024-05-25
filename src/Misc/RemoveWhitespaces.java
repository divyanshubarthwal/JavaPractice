package Misc;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  \\s is for spaces
		String str="JAVA           PROGRAM   SELENIUM";
		str=str.replaceAll("\\s","");
		System.out.println(str);
	}

}
