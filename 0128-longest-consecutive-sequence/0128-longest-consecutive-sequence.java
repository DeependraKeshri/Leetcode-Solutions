class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums)st.add(num);
        int maxStreak=0;
        for(int num:st){
            if(!st.contains(num-1)){
                int curr=num;
                int currStreak=1;
                while(st.contains(curr+1)){
                    currStreak++;
                    curr++;
                }
                if(maxStreak<currStreak)maxStreak=currStreak;
            }
        }
        return maxStreak;
    }
}