// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		double result = 1.0;
		double toReduce = 3.0;
		double toAdd = 5.0;
		int toAddTimes = 0, toReduceTimes = 0;
		if(Integer.parseInt(args[0])%2==0) {
			toAddTimes = ((Integer.parseInt(args[0])-1)/2);
			toReduceTimes = (Integer.parseInt(args[0]))/2;
		}
		else {
			toAddTimes = ((Integer.parseInt(args[0]))/2);
			toReduceTimes = ((Integer.parseInt(args[0]))/2);
		}
		for(int i = 0 ; i < toAddTimes ; i ++) {
			result += (1.0/toAdd);
			toAdd += 4.0;
		}
		for(int i = 0 ; i < toReduceTimes ; i ++) {
			result -= (1.0/toReduce);
			toReduce += 4.0;
		}
		result*=4;
		System.out.println("pi acourding to Java: " + Math.PI);
		System.out.println("pi, aproximated: " + result);
	}
}
