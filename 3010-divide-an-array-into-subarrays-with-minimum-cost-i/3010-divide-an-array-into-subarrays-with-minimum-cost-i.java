class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        // i = start of 2nd subarray
        for (int i = 1; i < n - 1; i++) {
            // j = start of 3rd subarray
            for (int j = i + 1; j < n; j++) {

                int minSecond = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    minSecond = Math.min(minSecond, nums[k]);
                }

                int minThird = Integer.MAX_VALUE;
                for (int k = j; k < n; k++) {
                    minThird = Math.min(minThird, nums[k]);
                }

                int cost = nums[0] + minSecond + minThird;
                ans = Math.min(ans, cost);
            }
        }

        return ans;
    }
}
