class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> ls =new ArrayList<> ();
        int sum =0;
        for(int i=1 ; i<Math.sqrt(num); i++){
            if(num % i == 0 ){
                if(i != num)
                ls.add(i);
            int pair = num / i ; 
            if(pair != i && pair != num)
                ls.add(pair);
            }
            
        }
        for(int n : ls){
            sum =sum +n;
        }
        if(sum == num) return true ;
        else return false;
    }
}