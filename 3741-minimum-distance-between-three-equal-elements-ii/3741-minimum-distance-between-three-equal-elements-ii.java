class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }

        int ans=Integer.MAX_VALUE;

        for(ArrayList<Integer> list: mp.values()){
            if(list.size()>=3){
                for(int i=0;i+2<list.size();i++){
                    int a=list.get(i);
                    int c=list.get(i+2);
                    ans=Math.min(ans,2*(c-a));
                }
            }
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}