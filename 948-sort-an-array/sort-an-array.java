import java.util.ArrayList;
class Solution {
    public int[] sortArray(int[] nums) {
        if( nums == null || nums.length <= 0) return nums;
        sortArrayhelper(nums , 0 ,nums.length-1);
        return nums;
    }
    private static void sortArrayhelper(int[] arr , int low , int high){
        if(low>= high) return ;
        int mid = (low+high)/ 2;
        sortArrayhelper(arr , low , mid);
        sortArrayhelper(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    private static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> ls = new ArrayList<> ();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]) {
                ls.add(arr[left]);
                left++;
            }
            else{
                ls.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            ls.add(arr[left]);
            left++;
        }
        while(right <= high){
            ls.add(arr[right]);
            right++;
        }
        for(int i=low ; i<=high ; i++){
            arr[i] = ls.get(i-low);
        }

    }

}