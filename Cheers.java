// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            int index = 0;
            while(index < args.length-1) {
                if((args[index].charAt(0)=='A')||(args[index].charAt(0)=='E')
                ||(args[index].charAt(0)=='F')||(args[index].charAt(0)=='H')
                ||(args[index].charAt(0)=='I')||(args[index].charAt(0)=='L')
                ||(args[index].charAt(0)=='M')||(args[index].charAt(0)=='N')
                ||(args[index].charAt(0)=='O')||(args[index].charAt(0)=='R')
                ||(args[index].charAt(0)=='S')||(args[index].charAt(0)=='X')) {
                        System.out.println("Give me an "+args[index]+": "+args[index]+"!");
                }
                else {
                        System.out.println("Give me a "+args[index]+": "+args[index]+"!");
                }
                index++;
            }
            System.out.println("What does that spell?");
            int count = 0;
            index = 0;
            String name = "";
            while(index < args.length-1) {
                name += args[index];
                index++;
            }
            while(count < Integer.parseInt(args[args.length-1])) {
                System.out.println(name + " ! ! !");
                count++;
            }

        }
}
