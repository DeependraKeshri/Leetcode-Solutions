class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int val:nums){
            if(!list.contains(val))list.add(val);
            else list.remove(Integer.valueOf(val));
        }
        int ans[]=new int[2];
        for(int val:list){
            if(ans[0]==0)ans[0]=val;
            else ans[1]=val;
        }
        return ans;
    }
}