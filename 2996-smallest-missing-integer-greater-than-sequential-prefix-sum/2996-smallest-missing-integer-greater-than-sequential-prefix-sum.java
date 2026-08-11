class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        int i=1, sum=nums[0];
        while(i<nums.length){
            if(nums[i]!=nums[i-1]+1)break;
            sum+=nums[i];
            i++;
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}