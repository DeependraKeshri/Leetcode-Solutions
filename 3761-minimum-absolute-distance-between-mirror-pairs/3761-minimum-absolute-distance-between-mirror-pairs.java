class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                ans = Math.min(ans, i - mp.get(nums[i]));
            }

            int num = nums[i], rev = 0;
            while(num > 0){
                rev = rev * 10 + (num % 10);
                num /= 10;
            }

            mp.put(rev, i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}