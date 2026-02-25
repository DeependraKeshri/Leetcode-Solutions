class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i%3==1)c++;
            else if(i%3==2)c++;
            else continue;
        }
        return c;
    }
}