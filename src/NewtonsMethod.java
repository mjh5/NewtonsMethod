import java.util.Scanner;

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
	static int power;
	
	/**
	 * The value to estimating the root at.
	 * f(x) = (x ^ power) - value
	 */
	static int value;
	
	/**
	 * Constructor 
	 */
	public NewtonsMethodRunner(int v, int p) {
		value = v;
		power = p;		
	}
	
	/**
	 * Default constructor.
	 */
	
	public NewtonsMethodRunner() {
		power = 0;
		value = 0;
	}
	
	
	private static double function(double x){
		return Math.pow(x, power) - value;
	}
	
	private static double functionDerivative(double x) {
		return power * Math.pow(x, power - 1);
	}
	 
	public static double newton(double x, int i) {
		if (i == 0) {
			return x;
		}
		double newX = x - (function(x)/functionDerivative(x));
		System.out.println(newX);
		return newton(newX, --i);
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to our Newtons Method Project!\nThis program estimates the nth root of a number using Newton's Method.");
		
		System.out.print("Enter the value you would like to take the root of: ");
		int val = userInput.nextInt();
		
		System.out.print("Enter the degree of the root you would like to estimate: ");
		int pow = userInput.nextInt();
		
		NewtonsMethodRunner n = new NewtonsMethodRunner(val, pow);
		
		System.out.print("Enter the initial guess value: ");
		int x = userInput.nextInt();
		
		System.out.print("How many iterations of Newtons Method would you like to run? ");
		int i = userInput.nextInt();
		
		System.out.println("");
		
		n.newton(x, i);
	}

}
