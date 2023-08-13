import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Algo9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*9. Ask the user to input a single word. If they enter a 
        sentence or multiple words, prompt them again. After receiving a valid 
        word, determine if it's a palindrome.For verification, use the words "noon," 
        "civic," "racecar," and "level." These should be recognized as palindromes.
         */

        String word = " ";
        do {
            System.out.print("Enter your sentence word:");
            word = scanner.nextLine();

            if (word.isBlank()){
                System.out.println("Invalid text! Try again.");
            }
            else if(word.contains(" ")){
                System.out.println("Invalid word! Try again.");
            }
        } while(word.isBlank()||word.contains(" "));
        //     word = scanner.next();
        //     if (!scanner.nextLine().trim().isEmpty()) {
        //         continue;
        //     }
        //     System.out.println(word);
        // } while (!scanner.nextLine().trim().isEmpty());

        char[] wordCharacters = word.toCharArray();
        // System.out.println(Arrays.toString(wordCharacters));
        char[] wordOpposite = new char[wordCharacters.length];

        for (int i = wordCharacters.length - 1, j = 0; i >= 0; i--, j++) {
            wordOpposite[j] = wordCharacters[i];
        }

        // System.out.println(Arrays.toString(wordCharacters));
        // System.out.println(Arrays.toString(wordOpposite));

        if (Arrays.equals(wordCharacters, wordOpposite)) {
            System.out.println("'" + word + "'" + " is a palindrome.");
        } else {
            System.out.println("'" + word + "'" + " is not a palindrome.");
        }

    }

}
