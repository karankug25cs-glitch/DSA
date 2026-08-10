class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ls = new ArrayList<>();
        int n1 =nums1.length;
        int n2 = nums2.length;
        int j = 0;
        int i = 0;
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                ls.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else j++;
        }
        int[] res = new int[ls.size()];
        int k = 0;
        for(int it : ls){ 
            res[k++] = it;
        }
        return res;
    }
}