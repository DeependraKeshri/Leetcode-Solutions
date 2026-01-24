class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0;
        for(int i=0; i<nums.size()-1; i++){
            int s=i+1, e=nums.size()-1;
            int idx=-1;
            int t=target-nums.get(i);
            while(s<=e){
                int mid=s+(e-s)/2;
                if(t>nums.get(mid)){
                    idx=mid;
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
            if(idx!=-1)count+=(idx-i);
        }
        return count;
    }
}