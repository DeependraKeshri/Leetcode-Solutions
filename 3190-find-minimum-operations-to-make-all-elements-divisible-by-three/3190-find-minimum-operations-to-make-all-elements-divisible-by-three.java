class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i:nums){
            int val=i%3;
            if(val==1)c++;
            else if(val==2)c++;
            else continue;
        }
        return c;
    }
}