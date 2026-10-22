class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res1 = new ArrayList<>();

        for(int j=0; j<numRows; j++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<=j; i++){
                if(i == 0 || i == j){
                    temp.add(1);
                }
                else{
                    List<Integer> prevRow = res1.get(j - 1);
                    temp.add(prevRow.get(i - 1) + prevRow.get(i));
                }
            }
            res1.add(temp);
        }
        return res1;
    }
}