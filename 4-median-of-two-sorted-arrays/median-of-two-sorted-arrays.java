class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med = merge(nums1 , nums2);
        return med ;
    }
    private static double merge(int[] nums1 , int[] nums2){
        ArrayList<Integer> ls = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(nums1[i] <= nums2[j] ){
                ls.add(nums1[i]);
                i++;
            }
            else{
                ls.add(nums2[j]);
                j++;
            }
        }
        while(i < n){
            ls.add(nums1[i]);
            i++;
        }
        while(j < m){
            ls.add(nums2[j]);
            j++;
        }
        return median(ls);
    }
    private static double median(ArrayList<Integer> list){
        int k = list.size();
        int mid = k/2;
        if(k%2 == 0){
            return (list.get(mid) + list.get(mid-1))/2.0;
        }
        return (list.get(mid));
    }
}