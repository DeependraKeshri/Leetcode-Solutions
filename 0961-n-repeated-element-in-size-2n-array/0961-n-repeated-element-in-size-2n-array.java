class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        int max=0, val=nums[0];
        for(int i:mp.keySet()){
            if(max<mp.get(i)){
                val=i;
                max=mp.get(i);
            }
        }
        return val;
    }
}