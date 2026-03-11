class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int ans = 0;
        int i = 0;
        while(i < nums.size()){
            int j = i + 1;
            while(j < nums.size() && nums.get(j-1) < nums.get(j)){
                j++;
            }
            int l = j + 1;
            while(l < nums.size() && nums.get(l-1) < nums.get(l)){
                l++;
            }
            int val = Math.max((j-i)/2, l-j);
            ans = Math.max(ans, Math.min(j-i, val));
            i = j;
        }
        return ans;
    }
}