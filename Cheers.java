// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            int index = 0;
            while(index < args[0].length()) {
                if((args[0].charAt(index)=='A')||(args[0].charAt(index)=='E')
                ||(args[0].charAt(index)=='F')||(args[0].charAt(index)=='H')
                ||(args[0].charAt(index)=='I')||(args[0].charAt(index)=='L')
                ||(args[0].charAt(index)=='M')||(args[0].charAt(index)=='N')
                ||(args[0].charAt(index)=='O')||(args[0].charAt(index)=='R')
                ||(args[0].charAt(index)=='S')||(args[0].charAt(index)=='X')) {
                        System.out.println("Give me an "+args[0].charAt(index)+": "
                        +args[0].charAt(index)+"!");
                }
                else {
                        System.out.println("Give me a "+args[0].charAt(index)+": "
                        +args[0].charAt(index)+"!");
                }
                index++;
            }
            System.out.println("What does that spell?");
            int count = 0;
            while(count < Integer.parseInt(args[1])) {
                System.out.println(args[0] + " ! ! !");
                count++;
            }

        }
}
