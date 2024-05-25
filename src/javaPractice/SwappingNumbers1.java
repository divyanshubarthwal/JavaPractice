package javaPractice;

public class SwappingNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st method
		int a=10,b=20;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("Value is "+ a+" " +b);
		
		// 2nd method
		//Using + and -
		
		int c=10 , d=40;
		
		c=c+d;  //c=50
		d=c-d;   //d=10
		c=c-d;		//c=40
		System.out.println("Value is "+ c+" " +d);
		
		//3rd method
		//Using / and *
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		//4th method XOR
		a=a^b;
		b=a^b;
		a=a^b;
		
		
	}

}
