class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] != i) return i;
        // }
        // return nums.length;

        boolean[] res = new boolean[nums.length + 1];
        for(int i : nums){
            res[i] = true;
        }
        for(int j=0; j<=nums.length; j++){
            if(!res[j]) return j;
        }
        return -1;
    }
}