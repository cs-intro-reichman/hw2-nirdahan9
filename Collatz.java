// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int seed = 1, toSeed = Integer.parseInt(args[0]), currentResult = 1;
		int turns = 1;
		String mode = args[1];
		boolean newGame=true;
		if(mode.equals("V")||mode.equals("v")) {
			while(seed<=toSeed) {
				System.out.print(currentResult+" ");
				while((currentResult!=1)||newGame)
				{
					newGame=false;
					if(currentResult%2==0) currentResult/=2;
					else {
						currentResult*=3;
						currentResult++;
					}
					System.out.print(currentResult+" ");
					turns++;
				}
				System.out.print("("+turns+")\n");
				turns=1;
				seed++;
				newGame=true;
				currentResult = seed;
			}
		}
		System.out.println("Every one of the first "+toSeed+" hailstone sequences reached 1.");
	}
}
