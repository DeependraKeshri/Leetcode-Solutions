class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], 1);
            }else{
                mp.put(nums[i], mp.get(nums[i])+1);
            }
        }
        int max=0;
        for(int val:mp.keySet()){
            if(mp.get(val)>max)max=mp.get(val);
        }
        int count=0;
        for(int val: mp.keySet()){
            if(mp.get(val)==max)count+=mp.get(val);
        }
        return count;
    }
}