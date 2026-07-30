class Solution {
    public boolean check(int[] nums) {
        int turn= 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1])
                turn++;
        }
        if(nums[nums.length -1] > nums[0])
                turn++;
        if(turn <= 1){
            return true;
        }
        else return false;
    }
}