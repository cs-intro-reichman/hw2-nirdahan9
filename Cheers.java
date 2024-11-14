// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            int index = 0;
            char ch = args[0].toUpperCase().charAt(index);
            char chUp = args[0].toUpperCase().charAt(index);
            while(index < args[0].length()) {
                ch = args[0].charAt(index);
                chUp = args[0].toUpperCase().charAt(index);
                if((chUp=='A')||(chUp=='E')||(chUp=='F')||(chUp=='H')||(chUp=='I')||(chUp=='L')
                ||(chUp=='M')||(chUp=='N')||(chUp=='O')||(chUp=='R')||(chUp=='S')||(chUp=='X')) {
                        System.out.println("Give me an  "+chUp+": "+ch+"!");

                }
                else {
                        System.out.println("Give me a  "+ch+": "+ch+"!");
                }
                index++;
            }
            System.out.println("What does that spell?");
            for(int i = 0; i < Integer.parseInt(args[1]) ; i ++) {
                System.out.println(args[0].toUpperCase() + " !!!");
            }

        }
}
