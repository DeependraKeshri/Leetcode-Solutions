class Solution {
    public int sumCounts(List<Integer> nums) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.size(); i++){
            int count=0;
            set.clear();
            for(int j=i; j<nums.size(); j++){
                set.add(nums.get(j));
                list.add(set.size());
            }
        }
        int ans=0;
        for(int i=0; i<list.size(); i++){
            ans+=(list.get(i)*list.get(i));
        }
        return ans;
    }
}