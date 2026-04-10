class Solution {
    public int minimumDistance(int[] nums) {
        int count=Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1; k<nums.length; k++){
                        if(nums[j]==nums[k]){
                            int val=(j-i)+(k-j)+(k-i);
                            if(val<count)count=val;
                            break;
                        }
                    }
                }
            }
        }
        if(count==Integer.MAX_VALUE)return -1;
        return count;
    }
}