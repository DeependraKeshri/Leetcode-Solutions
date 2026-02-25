class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public void subset(int nums[], List<Integer> l, int i){
        if(i==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        subset(nums, l, i+1);
        l.remove(l.size()-1);
        subset(nums, l, i+1);
    }
    public int subsetXORSum(int[] nums) {
        List<Integer> l=new ArrayList<>();
        subset(nums, l, 0);
        int sum=0;
        for(int i=0; i<list.size(); i++){
            int xor=0;
            for(int j=0; j<list.get(i).size(); j++){
                xor^=list.get(i).get(j);
            }
            sum+=xor;
        }
        return sum;
    }
}