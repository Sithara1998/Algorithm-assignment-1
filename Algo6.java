import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*6. Prompt the user to enter a sentence (using ASCII characters). Check to ensure
        the input isn't empty. If the input passes validation, invert the order of the words
        and then display the resulting sentence. */

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

        String[] wordsArray = new String[count+1];

        for (int i = 0,j=0; i < charachters.length; i++) {
            words+=charachters[i];
            if (charachters[i]== ' '|| i==charachters.length-1){
                wordsArray[j]= words.strip();
                j++;
                words = "";
                continue;
            }   
        }

        // Taking reverse of words
        String x = " ";
        for (int i = wordsArray.length-1, j=0; i>=0; i--,j++) {
            x= wordsArray[j] ; 
            wordsArray[j]=wordsArray[i];
            wordsArray[i] = x;
            if (i==wordsArray.length/2){
                break;
            }  
        }
        String str = "";
        for (int i = 0; i < wordsArray.length; i++) {
            str+=wordsArray[i]+" ";  
        }

        System.out.println(str);
 
    } 
}
