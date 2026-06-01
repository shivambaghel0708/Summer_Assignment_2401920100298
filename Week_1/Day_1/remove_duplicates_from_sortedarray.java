package Week_1.Day_1;

public class remove_duplicates_from_sortedarray {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[k]!=nums[i]){
                nums[++k]=nums[i];
            }
             } 
        return k+1;   
    }
}
    

