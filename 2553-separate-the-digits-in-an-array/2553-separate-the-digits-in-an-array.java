class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=nums.length-1; i>=0; i--){
            int val=nums[i];
            while(val>0){
                list.add(0,val%10);
                val/=10;
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}