import java.util.Arrays;
import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*6. Prompt the user to enter a sentence (using ASCII characters). Check to ensure
        the input isn't empty. If the input passes validation, invert the order of the words
        and then display the resulting sentence. */

        // Entering a text
        String text = " ";
        do{
            System.out.print("Enter your sentence: ");
            text  = scanner.nextLine();

            if (text.isBlank()){
                System.out.println("Invalid text! Try again.");
            }
        } while(text.isBlank());
        
        char[] charachters= text.strip().toCharArray();

        int count = 0;
        for (int k = 0; k < charachters.length; k++) {
            if (charachters[k]== ' '){
                count+=1;
            }
            
        }

        // forming words array
        String words = "";

        int[] wordsArrayLength = new int[count+1];
        String[] wordsArray = new String[count+1];


        for (int i = 0,j=0; i < charachters.length; i++) {
            words+=charachters[i];
            if (charachters[i]== ' '|| i==charachters.length-1){
                wordsArrayLength[j]= words.strip().length();
                wordsArray[j] = words;
                j++;
                words = "";
                continue;
            }   
        }

        // System.out.println(Arrays.toString(wordsArray));
        // System.out.println(Arrays.toString(wordsArrayLength));

        // finding minimum length word and maximum length word
        
        int[] nums = wordsArrayLength;

        int i=0;
        int max = 0;
        int min = 0;
        int minIndex = 0;
        int maxIndex = 0;
        
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i]<nums[j]){
                max = nums[j];
                maxIndex = j;
                i=j;
            }else{
                max = nums[i]; 
                maxIndex = i;          
            }    
        }
        // System.out.println("Maximum number of the array: "+max);

        for (int j = i+1; j < nums.length; j++) {
            if (nums[i]<nums[j]){
                min = nums[i];
                minIndex = i;
            }else{
                min = nums[j]; 
                minIndex = i; 
                i=j;         
            }
        }
        System.out.println("Longest word: "+ wordsArray[maxIndex]); 
        System.out.println("Smallest word: "+wordsArray[minIndex]);

        
    } 
}
