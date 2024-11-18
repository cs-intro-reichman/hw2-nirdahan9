// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		double result = 1.0;
		double toReduce = 3.0;
		double toAdd = 5.0;
		int times = Integer.parseInt(args[0]);
		if(times %2 ==0) { // checking the case that the number is even
			times = (times-2)/2 ;
			for(int i = 0 ; i < times ; i++) {
				result -= (1.0/toReduce);
				toReduce += 4.0;
				result += (1.0/toAdd);
				toAdd += 4.0;
			}
			result -= (1.0/toReduce);
		}
		else { // checking the case that the times number is odd
			times /= 2;
			for(int i = 0 ; i < times ; i++) {
				result -= (1.0/toReduce);
				toReduce += 4.0;
				result += (1.0/toAdd);
				toAdd += 4.0;
			}
		}
		result *= 4.0;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + result);
	}
}
