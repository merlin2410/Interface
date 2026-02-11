package p1;
import p1.MathFunc;

public class MyMath implements MathFunc{

	public int sum(int a, int b){
		return a+b;
	}
	public int prod(int a, int b){
		return a*b;
	}

	public double div(double a, double b){
		return a/b;
	}

	public int subtract(int a, int b){
		return a-b;
	}

}