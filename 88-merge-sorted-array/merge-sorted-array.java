import java.util.ArrayList;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> ls = new ArrayList<> ();
        int left = 0;
        int right = 0;
        int last1 = m-1;
        int last2 = n-1;
        while(left <= last1 && right <=last2){
            if(nums1[left] <= nums2[right]){
                ls.add(nums1[left]);
                left++;
            }
            else {
                ls.add(nums2[right]);
                right++;
            }
        } 
        while(left <= last1){
            ls.add(nums1[left]);
            left++;
        }
        while(right <= last2){
            ls.add(nums2[right]);
            right++;
        }
        for(int i=0 ; i< ls.size(); i++){
            nums1[i] = ls.get(i); 
        }
    }
}