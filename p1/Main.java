package p1;
public class Main{

	public static void main(String[] args){

		MathFunc m = new MyMath();
		int a = 24;
		int b = 3;
		
		System.out.println("Following are the calcuclations");
		System.out.println("Sum is: "+m.sum(a,b));	
		System.out.println("Product is: "+m.prod(a,b));	
		System.out.println("Quotient is: "+m.div((double)a,(double)b));
		System.out.println("Difference is: "+m.subtract(a,b));

	}

}