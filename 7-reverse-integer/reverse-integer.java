class Solution {
    public int reverse(int x) {
        long revnum = 0;
        while(x != 0){
            int ld = x%10;
            revnum = (revnum * 10) + ld ;
            if(revnum > (Integer.MAX_VALUE ) || revnum <( Integer.MIN_VALUE ) ){
                return 0;
            }
            x/=10;
        }
        return (int) revnum;
    }
 
}