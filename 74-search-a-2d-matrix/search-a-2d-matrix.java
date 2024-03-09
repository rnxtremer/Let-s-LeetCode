class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0, col = cols - 1;
        while (row < rows && col >= 0) {
            int curr = matrix[row][col];
            if (curr == target) {
                return true;
            } else if (curr < target) {
                row++; 
            } else {
                col--; 
            }
        }

        return false; 
    }
}
