class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2 dimensional array.
        int[][] dp = new int[m][n];
        // Assign all elements in the first column to 1.
        for (int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        // Assign all elements in the first row to 1.
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=1;
        }
        // Update the other positions by adding element in the left colum and the top row.
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
