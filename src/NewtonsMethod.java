/**
 * 
 * @author micha
 * 
 * This class will estimate the nth root of a number using Newtons Method recursively.
 *
 */
public class NewtonsMethod {

	/**
	 * The power of the funtion used in the estimation.
	 * f(x) = (x ^ power) - value;
	 */
	int power;
	
	/**
	 * The value to estimating the root at.
	 * f(x) = (x ^ power) - value
	 */
	int value;
	
	/**
	 * Constructor 
	 */
	public NewtonsMethod(int v, int p) {
		value = v;
		power = p;		
	}
	
	/**
	 * Default constructor.
	 */
	
	public NewtonsMethod() {
		power = 0;
		value = 0;
	}
	
	private double function(double x){
		return Math.pow(x, power) - value;
	}
	
	private double functionDerivative(double x) {
		return power * Math.pow(x, power - 1);
	}
	
	public static double newton(double x, int i) {
		if (i == 0) {
			return x;
		}
		double newX = x - (function(x)/functionDerivative(x));
		i--;
		System.out.println("Iteration number " + i + ": " + newX);
		newton(newX, i);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to our Newtons Method Project!\nThis program estimates the nth root of a number using Newton's Method.");
	}

}
