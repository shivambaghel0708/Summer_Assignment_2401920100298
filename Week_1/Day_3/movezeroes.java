package Week_1.Day_3;

public class movezeroes {
    public void moveZeroes(int[] nums) {
        int i,k=0;
        for (i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
        
    }
    
}
