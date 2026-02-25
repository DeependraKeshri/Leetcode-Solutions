class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int j=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]))set.add(nums[i]);
            else arr[j++]=nums[i];
        }
        return arr;
    }
}