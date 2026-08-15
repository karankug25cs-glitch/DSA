class Solution {
    public int maxSubArray(int[] nums) {
         int n = nums.length;
        // //==============================Brute approach=================
        // int maxsum = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         int sum = 0;
        //         for(int k=i; k<=j; k++){
        //             sum += nums[k];
        //             maxsum = Integer.max(sum, maxsum);
        //         }
        //     }
        // }

        //================================Bettter approach=================
        // for(int i=0; i<n; i++){
        //     int sum =0;
        //     for(int j=i; j<n; j++){
        //         sum += nums[j];
        //         maxsum = Integer.max(sum , maxsum);
        //     }
        // }
        //======================Optimal appraoch=================================
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum > maxsum){
                maxsum = sum;
            }
            if(sum  < 0){
                sum = 0;
            }
        }
        return maxsum;
    }
}