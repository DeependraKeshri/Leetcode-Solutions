class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] >= 0) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        int neg = s; 
        s = 0;
        e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] <= 0) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        int pos = n - s;
        return Math.max(neg, pos);
    }
}
