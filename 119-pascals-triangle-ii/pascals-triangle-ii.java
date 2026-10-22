class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            ls.add((int)ncr(rowIndex,i));
        }
        return ls;
    }
    public long  ncr(int n, int r){
        long  res = 1;
        for(int i=0; i<r; i++){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
}