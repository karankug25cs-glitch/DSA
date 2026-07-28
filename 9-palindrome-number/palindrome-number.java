class Solution {
    public boolean isPalindrome(int x) {
        int originalnum = x;
        int revnum =0;
        while(x >0){
            int ld = x%10 ;
            revnum = (revnum * 10 ) + ld ;
            x /= 10 ;
        }
        if (revnum == originalnum){
            return true;
        }
        else { 
            return false;
        }
    }
}