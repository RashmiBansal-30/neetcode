class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                char val = board[r][c];
                if (val != '.'){
                    if (!seen.add("row " + r + " has " + val) ||
                        !seen.add("col " + c + " has " + val) ||
                        !seen.add("box " + (r / 3) + "-" + (c / 3) + " has " + val)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
