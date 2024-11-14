// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            int index = 0;
            char ch = args[0].toUpperCase().charAt(index);
            while(index < args[0].length()) {
                if((ch=='A')||(ch=='E')||(ch=='F')||(ch=='H')||(ch=='I')||(ch=='L')
                ||(ch=='M')||(ch=='N')||(ch=='O')||(ch=='R')||(ch=='S')||(ch=='X')) {
                        System.out.println("Give me an "+ch+":  "+ch+"!");

                }
                else {
                        System.out.println("Give me a "+ch+":  "+ch+"!");
                }
                index++;
                ch = args[0].toUpperCase().charAt(index);
            }
            System.out.println("What does that spell?");
            for(int i = 0; i < args[0].length() ; i ++) {
                System.out.println(args[0] + " ! ! !");
            }

        }
}
