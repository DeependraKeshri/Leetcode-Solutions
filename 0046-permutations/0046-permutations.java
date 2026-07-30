class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean valid[]=new boolean[nums.length];
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        helper(nums, list, l, valid);
        return list;
    }
    public void helper(int nums[], List<List<Integer>> list, List<Integer> l, boolean valid[]){
        if(l.size()==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!valid[i]){
                l.add(nums[i]);
                valid[i]=true;
                helper(nums, list, l, valid);
                valid[i]=false;
                l.remove(l.size()-1);
            }
        }
    }
}