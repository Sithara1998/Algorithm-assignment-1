import java.util.Scanner;

public class Algo1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num = 0;
        do{
            System.out.print("Enter a number:");
            num = scanner.nextInt();
            scanner.nextLine();
            
            if (num<0){
                System.out.println("Invalid! Enter a positive number");
            }
        } while(num<0);

        int x = 1;
        int y = 0;
        int z = 1; 
        if (num>0){
            System.out.println("Fibonacci Number Sequence:");    
            System.out.println(1);
            }
        do {
            
            x=y+z;
            y=z;
            z=x;
            if (x>num){
                break;
            }
            System.out.println(x);
            
        }while(x++<num);

        

    }

}