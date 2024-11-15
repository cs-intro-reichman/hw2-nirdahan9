// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		int count = 0 , lower = 0 , higher = 0;
		while(count<n) {
			if(Math.random()<0.5) lower++;
			else higher++;
			count++;
		}
		System.out.println(">0.5: "+ lower + " times");
		System.out.println("<=0.5: "+ higher + " times");
		double ratio = 0.0;
		if(higher<lower) ratio = (double) higher/lower;
		else ratio = (double) lower/higher;
		System.out.println("Ratio: "+ (ratio));
	}
}
