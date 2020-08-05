class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int temp = x;
        int palindrome = 0;

        while(x!=0){
            int mod = x%10;
            palindrome = palindrome*10 + mod;
            x/=10;
        }
        if(temp == palindrome)
            return true;
        else
            return false;
    }
}