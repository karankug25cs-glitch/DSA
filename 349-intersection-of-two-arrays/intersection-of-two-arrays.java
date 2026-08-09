import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer> res = new ArrayList<> ();
       Set<Integer> sa = new HashSet<>();
       for(int i : nums1){
        sa.add(i);
       }
       for(int j : nums2){
        if(sa.contains(j)){
            res.add(j);
            sa.remove(j);
        }
       }
       int i =0 ;
        int[] a = new int[res.size()];
        for(int k : res){
            a[i++] = k ;
        }
          return a;
    }
}