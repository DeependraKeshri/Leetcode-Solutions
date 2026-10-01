class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==0)return list;
        int prev=nums[0], curr=prev+1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=curr){
                if(curr==prev+1){
                    list.add(String.valueOf(prev));
                }else{
                    list.add(String.valueOf(prev)+"->"+String.valueOf(curr-1));
                }
                prev=nums[i];
                curr=prev;
            }
            curr++;
        }
        if(curr==prev+1){
            list.add(String.valueOf(prev));
        }else{
            list.add(String.valueOf(prev)+"->"+String.valueOf(curr-1));
        }
        return list;
    }
}