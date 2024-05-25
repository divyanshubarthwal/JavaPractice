package Important;

public class LinearSearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Boolean flag=false;
		int a[]= {10,30,20,44,50,66};
		
		int searchele=50;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==searchele) {
				System.out.println("Element found "+ i);
				flag=true;
				break;
			}
		}if(flag==false) {
			System.out.println("Element Not found");
		}
	}

}
