class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(min>nums[i])min=nums[i];
            if(max<nums[i])max=nums[i];
            set.add(nums[i]);
        }
        for(int i=min; i<max; i++){
            if(!set.contains(i))list.add(i);
        }
        return list;
    }
}