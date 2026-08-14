import java.util.*;
class Solution {
    public boolean check(int[] nums) {
        // int turn= 0;
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i] > nums[i+1])
        //         turn++;
        // }
        // if(nums[nums.length -1] > nums[0])
        //         turn++;
        // if(turn <= 1){
        //     return true;
        // }
        // else return false;

        String s ="";
        for(int i : nums){
            s += i+" ";
        }
        String sp = s+s;
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        String sort = "";
        for(int j : sorted){
            sort += j + " ";
        }
        if(sp.contains(sort)) return true;
        return false;

    }
}