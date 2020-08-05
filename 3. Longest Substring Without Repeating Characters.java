class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       
        int len=0,res=0;
        
        char[] chars = s.toCharArray();
        
        for(int i=0; i<chars.length; i++){
            char ch = chars[i];
            len=0;
             Map map = new HashMap();
            map.put(ch,i);
            len++;
            
            for(int j=i+1; j<chars.length; j++){
             ch = chars[j];
                
            if(map.containsKey(ch))
                break;
            else{
            map.put(ch,j);
            len++;
            }
        }
        if(len>res){
            res = len;
        }
    }
    return res;
}
}