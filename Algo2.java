public class Algo2 {
    public static void main(String[] args) {

        int[] nums = {-5,2,7,10,58,-7,8,23};

        int i=0;
        int max = 0;
        int min = 0;
        
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i]<nums[j]){
                max = nums[j];
                i=j;
            }else{
                max = nums[i];           
            }    
        }
        System.out.println("Maximum number of the array: "+max);

        for (int j = i+1; j < nums.length; j++) {
            if (nums[i]<nums[j]){
                min = nums[i];
            }else{
                min = nums[j];  
                i=j;         
            }
        }
        System.out.println("Minimum number of the array: "+min); 
    }
         
} 

