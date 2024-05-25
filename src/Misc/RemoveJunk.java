package Misc;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="&(*&^(*^  string 012345678";
		String s1="@#@ Selenium *^&%^$$DWW";
		// ^ means other than this
		s=s.replaceAll("[^a-zA-Z0-9]","");
		s1=s1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		System.out.println(s1);
	}

}
