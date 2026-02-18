class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        int ans[]=new int[2];
        for(int val:mp.keySet()){
            if(mp.get(val)==1){
                if(ans[0]==0)ans[0]=val;
                else ans[1]=val;
            }
        }
        return ans;
    }
}