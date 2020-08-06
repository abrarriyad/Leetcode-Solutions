class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        int ptr=0;
        
        for(int i=0; i<len; i++){
            if(nums[i]!=val){
                nums[ptr++] = nums[i];
            }

        }
        return ptr;
    }
}