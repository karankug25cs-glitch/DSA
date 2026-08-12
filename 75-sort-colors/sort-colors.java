class Solution {
    public void sortColors(int[] arr) {
        int zero= 0;
        int ones = 0;
        int twos = 0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i] == 1){
                ones++;
            }
            if(arr[i] == 2) twos++;

        }
        if(zero != 0){
            for(int i=0; i<zero ;i++){
                arr[i] = 0;
            }
        }
        if(ones != 0){ 
            for(int i = zero;i<ones+zero; i++){
                arr[i] =1;
            }
        }
        if(twos != 0){
            for(int i=ones+zero;i<twos+ones+zero;i++){
                arr[i] = 2;
            }
        }
    }
}