import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> ls = new ArrayList<> ();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(nums1[i] == nums2[j]){
                    if(!ls.contains(nums1[i])){
                        ls.add(nums1[i]);
                    }
                }
            }
        }
        int[] a = new int[ls.size()];
        int i=0;
        for(int it : ls){
            a[i++] = it;
        }
        return a;
    }
}