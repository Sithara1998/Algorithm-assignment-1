import java.util.Arrays;
import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*10. Prompt the user to input a phone number in either of these formats: +94 XX XXX
    XXXX or 0XX-XXXXXXX , where X represents a digit. To check if a character is a digit,
    utilize the Character.isDigit() method. Do not use any other API for this task. If
    the phone number aligns with the provided patterns, display "Number is
    validated." If not, show "Invalid phone number." If the user doesn't provide any
    input, indicate "Telephone number can't be empty," and request them to enter it
    again. */

    String phoneNum = " ";
    char[] pNumber = new char[phoneNum.length()]; 
        do {
            System.out.print("Enter your phone word:");
            phoneNum = scanner.nextLine();

            if (phoneNum.isBlank()){
                System.out.println("Invalid Phone Number! Try again.");
            }
            // else if(!(phoneNum.contains(" ") || !(phoneNum.contains("-")))){
            //     System.out.println("Invalid Phone Number! Try again.");
            else{
                pNumber = phoneNum.toCharArray();
                System.out.println(Arrays.toString(pNumber));

                

            }



        } while(true);

    }


    
}
