package Interview;

public class SwappingTwoNumbres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=10;
		
		System.out.println("before swap " +a  +b);
		
		int t= a;
		a =b;
		b=t;
		System.out.println("After swap 3rd variable" +a +" " +b);

		
		int a1=5;
		int b1=10;
		a1= a1+b1;
		b1=a1-b1;
		a1=a1-b1;		
		System.out.println("After swap add sub" +a1 +" "  +b1);


		int c=5;
		int d=10;
		c=c*d;
		d=c/d;
		c=c/d;		
		System.out.println("After swap mul div" +c +" " +d);
		
		
		int a11=5;
		int b11=10;
		a11= a11^b11;
		b11= a11^b11;
        a11= a11^b11;

			
		System.out.println("After swap xor" +a11 +" " +b11);
		
		int a2=5;
		int b2=10;
		
		b2=a2+b2-(a2=b2);
		System.out.println("After swap single statement" +a2 +" " +b2);

	}

}
