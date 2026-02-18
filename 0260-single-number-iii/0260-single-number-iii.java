class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:nums){
            if(!set.contains(val))set.add(val);
            else set.remove(val);
        }
        int ans[]=new int[2];
        for(int val:set){
            if(ans[0]==0)ans[0]=val;
            else ans[1]=val;
        }
        return ans;
    }
}