class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        if(len==0)
            return 0;
        int ptr = 1;
        for(int i=0; i<len-1; i++){
           if(nums[i]!=nums[i+1]){
               nums[ptr] = nums[i+1];
               ptr++;
           }
        }
        return ptr;
    }
}