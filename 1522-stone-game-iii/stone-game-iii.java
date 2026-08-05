class Solution {

    Integer[] dp;

    public String stoneGameIII(int[] stoneValue) {

        dp = new Integer[stoneValue.length];

        int score = solve(stoneValue, 0);

        if (score > 0)
            return "Alice";
        else if (score < 0)
            return "Bob";
        else
            return "Tie";
    }

    private int solve(int[] arr, int i) {

        if (i >= arr.length)
            return 0;

        if (dp[i] != null)
            return dp[i];

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int x = 0; x < 3 && i + x < arr.length; x++) {

            sum += arr[i + x];

            int current =
                sum - solve(arr, i + x + 1);

            max = Math.max(max, current);
        }

        return dp[i] = max;
    }
}