
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] arr = new int[n];
        int max = 0;
        long k = (long) k1 + k2;
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, arr[i]);
        }
        long total = 0;
        for (int x : arr) {
            total += x;
        }
        if (k >= total) {
            return 0;
        }
        int low = 0, high = max;
        while (low < high) {
            int mid = low + (high - low) / 2;
            long operations = 0;
            for (int x : arr) {
                if (x > mid) {
                    operations += x - mid;
                }
            }
            if (operations <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        int level = low;
        long used = 0;
        long sum = 0;
        for (int x : arr) {
            if (x > level) {
                used += x - level;
                x = level;
            }
            sum += (long) x * x;
        }
        long remaining = k - used;
        for (int i = 0; i < n && remaining > 0; i++) {
            if (arr[i] >= level && level > 0) {
                sum -= (long) level * level;
                sum += (long) (level - 1) * (level - 1);
                remaining--;
            }
        }
        return sum;
    }
}
