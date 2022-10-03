class Solution {
    final static int MASK = 1000000007;
    public int numRollsToTarget(int d, int f, int target) {
        int[][] dp = new int[d + 1][target + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= d; i++) {
            for (int j = 0; j <= target; j++) {
                if (target > f * d) continue;
                for (int k = 1; k <= f; k++) {
                    if (j - k >= 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MASK;
                    }
                }
            }
        }

        return dp[d][target];
    }
}