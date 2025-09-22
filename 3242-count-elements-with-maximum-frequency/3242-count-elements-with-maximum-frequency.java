class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num:nums){
            mp.put(num , mp.getOrDefault(num,0)+1);
        }
        int max=-1;
        for(Map.Entry<Integer , Integer>entry:mp.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        int count=0;
        for(Map.Entry<Integer , Integer>entry:mp.entrySet()){
             if(entry.getValue()==max){
                count++;
             }
        }
        return count*max;
    }
}