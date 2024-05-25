package Important;

public class CharacterOcurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Java Programming Java OOPS";
		
		int len=str.length();
		System.out.println(len);
		int totalcount_afterRemove=str.replace("a","").length(); //total length after removing a
		System.out.println(totalcount_afterRemove);
		int count=len-totalcount_afterRemove;
		System.out.println(count);
	}

}
