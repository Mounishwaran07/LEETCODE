class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    // Diagonal elements must NOT be zero
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    // Non-diagonal elements MUST be zero
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}