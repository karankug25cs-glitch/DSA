class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int k = 1;
        int i =1;
        while(i<n){
            if(arr[i] != arr[k-1]){
                arr[k] = arr[i];
                k++;
            }
            i++;
        }
        return k;
    }
}