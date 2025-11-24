class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int mod = 0;   // store prefix modulo 5

        for (int bit : nums) {
            mod = (mod * 2 + bit) % 5;   // update only the remainder
            ans.add(mod == 0);
        }

        return ans;
    }
}
