class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)set.add(i);
        int ans=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int num=i+1;
                while(set.contains(num)){
                    num++;
                }
                if(num-i>ans)ans=num-i;
            }
        }
        return ans;
    }
}