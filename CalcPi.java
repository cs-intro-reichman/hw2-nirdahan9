// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		double result = 1.0;
		double toReduce = 3;
		double toAdd = 5;
		int count = 0;
		while(count < Integer.parseInt(args[0])) {
			result -= (double) (1.0/toReduce);
			toReduce += 4.0;
			result += (double) (1.0/toAdd);
			toAdd += 4.0;
			count+=2;
		}
		if(Integer.parseInt(args[0])%2==1) result -= (double) (1/toReduce);
		result*=4;
		System.out.println("pi acourding to Java: " + Math.PI);
		System.out.println("pi, aproximated: " + result);
	}
}
