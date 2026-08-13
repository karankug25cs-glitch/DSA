import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        mp.put(0 , 1);
        int prefsum = 0;
        int subarr = 0;
        for(int i=0;i<nums.length;i++){
            prefsum +=nums[i];
            int req = prefsum - k;
            if(mp.containsKey(req)){
                subarr+=mp.get(req);
            }
            mp.put(prefsum, mp.getOrDefault(prefsum,0)+1);
        }
        return subarr;
    }
}