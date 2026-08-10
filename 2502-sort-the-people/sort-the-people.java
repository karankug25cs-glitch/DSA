class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length-1; i++){
            int max=i;
            for(int j=i; j<heights.length; j++){
                if(heights[j] > heights[max]){
                    max = j;
                }
            }
                int temp = heights[max];
                heights[max] = heights[i];
                heights[i] = temp;
                String name = names[max];
                names[max] = names[i];
                names[i] = name;
                
        }
        return names;
    }
}