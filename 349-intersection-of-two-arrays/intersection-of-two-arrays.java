import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setA = new HashSet<>();
        for (int x : nums1) setA.add(x);

        Set<Integer> result = new LinkedHashSet<>();
        for (int y : nums2) {
            if (setA.contains(y)) result.add(y);
        }
        int k =0;
        int[] a = new int[result.size()];
        for (int val : result){
            a[k++] = val;
        }
        return a;
    }
}