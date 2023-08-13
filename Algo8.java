import java.util.Arrays;

public class Algo8 {
    public static void main(String[] args) {
        /*
         * 8. Given two arrays:
         * int[] numA = {5, 7, -2, 3, 4, 6, -8};
         * int[] numB = {7, 8, -8, 2, 1, -9, 6};
         * Determine and print the following:
         * 1. numA ∩ numB
         * 2. numA ∪ numB
         * 3. numA \ numB
         * 
         * Algorithm Assignment - 1 2
         * 
         * 4. numB \ numA
         * 5. numA △ numB
         */

        int[] numA = { 5, 7, -2, 3, 4, 6, -8 };
        int[] numB = { 7, 8, -8, 2, 1, -9, 6 };

        int[] intersection = new int[1];
        if (numB.length < numA.length) {
            intersection = new int[numB.length];
        } else {
            intersection = new int[numA.length];
        }
        int k = 0;
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {

                if (numA[i] == numB[j]) {
                    intersection[k] = numA[i];
                    k += 1;
                }
            }

        }
        System.out.println(Arrays.toString(intersection));

        // union

        int[] union = new int[numA.length+numB.length];
        for (int i = 0; i < union.length; i++) {
            union[i] = 
        }

    }

}
