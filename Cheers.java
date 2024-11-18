// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String s = args[0];
                int num = Integer.parseInt(args[1]);

                String upperS = s.toUpperCase();

                for(int i =0 ; i<upperS.length() ; i++){

                        if(( upperS.charAt(i) == 'A' )||( upperS.charAt(i) == 'E' )||( upperS.charAt(i) == 'F' )||( upperS.charAt(i) == 'H' )||( upperS.charAt(i) == 'I' )||( upperS.charAt(i) == 'L' )||
                        ( upperS.charAt(i) == 'M' )||( upperS.charAt(i) == 'N' )||( upperS.charAt(i) == 'O' )||( upperS.charAt(i) == 'R' )||( upperS.charAt(i) == 'S' )||( upperS.charAt(i) == 'X' )){
                        System.out.println("Give me an " + upperS.charAt(i) + ": " + upperS.charAt(i) + "!");
                        }
                        else{
                                System.out.println("Give me a " + upperS.charAt(i) + ": " + upperS.charAt(i) + "!");
                        }

                }

                System.out.println("What does that spell?");

                for(int i = 0 ; i < num ; i++){
                        System.out.println(upperS + "!!!");
                }


        



	    
        }
}
