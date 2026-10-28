class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long[][] arr = new long[n][2];
        for (int j = 0; j < n; j++) {
            int num = nums[j];
            int[] freq = new int[10];
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
            long rearranged = 0;
            for (int i = 9; i >= 0; i--) {
                while (freq[i] > 0) {
                    rearranged = rearranged * 10 + i;
                    freq[i]--;
                }
            }
            arr[j][0] = rearranged - nums[j];
            arr[j][1] = nums[j];
        }
        Arrays.sort(arr, (a, b) -> Long.compare(b[0], a[0]));
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < n && k > 0; i++) {
            if (arr[i][0] > 0) {
                sum += arr[i][0];
                k--;
            }
        }
        return sum;
    }
}