class Solution {
    public int reverse(int x) {
        int result = 0;
        int temp = x;
        while(x!=0){
        int mod = x%10;
        result = result*10 + mod;
         x = x/10;
        if(result%10 != mod)
            return 0;
    }
        return result;
    }
}