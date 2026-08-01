class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int largest = -1;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(nums[i] > largest){
                
                largest = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]<smallest){
                smallest = nums[i];
            }
        }
        int hcf =1;
        while(largest > 0 && smallest > 0){
            if(largest > smallest) largest =largest% smallest;
            else smallest = smallest % largest;
            if(largest == 0) hcf = smallest;
            else hcf = largest;
        }
        return hcf;
    }
}