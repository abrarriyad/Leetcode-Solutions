class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map map = new HashMap();
      int[] result=new int[2];
        
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int diff = target-current;
            if(map.containsKey(diff)){
                result[0]=(Integer) map.get(diff);
                result[1]=i;
                return result;
            }
            map.put(current,i);
        }
        return result;
    }
}