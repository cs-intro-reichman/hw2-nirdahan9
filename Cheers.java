// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            int index = 0;
            char ch = args[0].toUpperCase().charAt(index);
            char chUp = args[0].toUpperCase().charAt(index);
            String vowels = "AEFHILMNORSXaefhilmnorsx";
            while(index < args[0].length()) {
                ch = args[0].charAt(index);
                chUp = args[0].toUpperCase().charAt(index);
                if(vowels.indexOf(ch)!=-1) {
                        System.out.println("Give me an "+chUp+": "+chUp+"!");

                }
                else {
                        System.out.println("Give me a "+chUp+": "+chUp+"!");
                }
                index++;
            }
            System.out.println("What does that spell?");
            for(int i = 0; i < Integer.parseInt(args[1]) ; i ++) {
                System.out.println(args[0].toUpperCase() + " !!!");
            }

        }
}
