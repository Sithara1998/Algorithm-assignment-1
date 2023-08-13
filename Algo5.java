import java.util.Arrays;
import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /*Prompt the user to enter a text (ASCII only). Ensure the input is not empty. If the
        input is valid, invert the sequence of characters and display the reversed text. */

        // Entering Text
        String text = " ";
        do{
            System.out.print("Enter your text: ");
            text  = scanner.nextLine();

            if (text.isBlank()){
                System.out.println("Invalid text! Try again.");
            }
        } while(text.isBlank());
  
        char[] charachters= text.strip().toCharArray();

        System.out.println(Arrays.toString(charachters));

        // Taking reverse of text
        char x = ' ';
        for (int i = charachters.length-1, j=0; i>=0; i--,j++) {
            x= charachters[j] ; 
            charachters[j]=charachters[i];
            charachters[i] = x;
            if (i==charachters.length/2){
                break;
            }  
        }
        // System.out.println("nums = " + Arrays.toString(charachters));
        String textString = new String(charachters);
        System.out.println(textString);
    }
}
    

