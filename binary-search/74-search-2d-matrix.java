class Solution {
    public boolean searchMatrix(int[][] matrix, int target) { 

        int rows = matrix.length - 1, columns = matrix[0].length - 1, up = 0, down = rows, mid;
        while (up <= down) {
            mid = up + (down - up)/2;
            if (matrix[mid][columns] < target) {
                up = mid + 1;
            } else if (matrix[mid][0] > target) {
                down = mid - 1;
            } else {
                return Arrays.binarySearch(matrix[mid], target) >= 0 ? true : false;
            }
        }

        return false;
    }
}