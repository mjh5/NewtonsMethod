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
	
	
	

}
