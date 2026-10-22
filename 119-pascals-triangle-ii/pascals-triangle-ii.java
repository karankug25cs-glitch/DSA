class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ls = new ArrayList<>();
        // for(int i = 0; i <= rowIndex; i++){
        //     ls.add((int)ncr(rowIndex,i));
        // }


        // optimise
        rowIndex++;
        long res = 1;
        ls.add((int)res);
        for(int i=1; i<rowIndex; i++){
            res *= rowIndex - i;
            res /= i;
            ls.add((int)res);
        }
        return ls;
    }
    // public long  ncr(int n, int r){
    //     long  res = 1;
    //     for(int i=0; i<r; i++){
    //         res *= (n-i);
    //         res /= (i+1);
    //     }
    //     return res;
    // }
}