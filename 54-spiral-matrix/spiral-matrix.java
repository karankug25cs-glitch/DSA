class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        while (top <= bottom && left <= right) {
            // 1. Traverse Top Row
            for (int col = left; col <= right; col++) {
                ls.add(matrix[top][col]);
            }
            top++;
            
            // 2. Traverse Right Column
            for (int row = top; row <= bottom; row++) {
                ls.add(matrix[row][right]);
            }
            right--;
            
            // 3. Traverse Bottom Row
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    ls.add(matrix[bottom][col]);
                }
                bottom--;
            }
            
            // 4. Traverse Left Column
            if (left <= right) { // Fixed: was left <= bottom
                for (int row = bottom; row >= top; row--) {
                    ls.add(matrix[row][left]);
                }
                left++;
            }
        }
        return ls;
    }
}