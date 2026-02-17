class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int xor=0;
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]))xor^=nums[i];
            set.add(nums[i]);
        }
        return xor;
    }
}