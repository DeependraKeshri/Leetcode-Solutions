class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                int idx = Math.abs(nums[i]);
                idx %= n;
                if (idx == 0) res[i] = nums[i];
                else if (idx <= i) {
                    res[i] = nums[i - idx];
                } else {
                    res[i] = nums[n - (idx - i)];
                }
            } else if (nums[i] == 0) {
                res[i] = 0;
            } else {
                int idx = nums[i] % n;
                res[i] = nums[(i + idx) % n];
            }
        }
        return res;
    }
}
