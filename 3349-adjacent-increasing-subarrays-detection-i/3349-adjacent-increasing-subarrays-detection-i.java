class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for(int i = 0; i <= nums.size() - 2*k; i++){
            boolean val = true;
            for(int j = i+1; j < i+k; j++){
                if(nums.get(j-1) >= nums.get(j) || nums.get(j+k-1) >= nums.get(j+k)){
                    val = false;
                    break;
                }
            }
            if(val) return true;
        }
        return false;
    }
}