
import java.util.Arrays;

public class Algo3 {
    public static void main(String[] args) {

        /*Given the array int[] nums = {10, 20, 30, 40, 50}; , Construct a new array and
populate it with the elements of the original array, but in the opposite sequence.
Then assign the memory location of the new array to nums and print out the
nums array. */

        int[] nums = {10, 20, 30, 40, 50};
        int[] numsOpposite= new int[nums.length];

        for (int i = nums.length-1, j=0 ; i>=0; i--,j++) {
            numsOpposite[j]=nums[i];
        }

        nums = numsOpposite;
        System.out.println();
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println();
        
    }
    
}
