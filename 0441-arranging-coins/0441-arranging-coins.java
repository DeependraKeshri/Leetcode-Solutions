class Solution {
    public int arrangeCoins(int n) {
        long s = 1, e = n;
        int ans = 0;
        while (s <= e) {
            long m = s + (e - s) / 2;
            long coins = m * (m + 1) / 2;
            if (coins <= n) {
                ans = (int)m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}