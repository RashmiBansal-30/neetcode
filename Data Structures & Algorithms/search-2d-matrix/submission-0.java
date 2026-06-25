class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int m = matrix.length, n = matrix[0].length;
        int beg = 0, end = (m * n) - 1;

        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            int row = mid / n;
            int column = mid % n;
            int element = matrix[row][column];

            if (element == target) {
                return true;
            } else if (element < target) {
                beg = mid + 1;  
            } else {
                end = mid - 1; 
            }
        }
        return false;
    }
}