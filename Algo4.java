import java.util.Arrays;

public class Algo4 {
    public static void main(String[] args) {
        
            /*Using the aforementioned array, invert the order of its elements directly within
    the same array. You must not create any additional arrays for this task. Once
    finished, print out the nums array. */


        int[] nums = {10, 20, 30, 40, 50};
        int x=0;
        for (int i = nums.length-1, j=0; i>=0; i--,j++) {
            x= nums[j] ; 
            nums[j]=nums[i];
            nums[i] = x;
            if (i==nums.length/2){
                break;
            }  
        }
        System.out.println("nums = " + Arrays.toString(nums));
    }
    
}
