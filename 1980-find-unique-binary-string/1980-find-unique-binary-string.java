class Solution {
    public void helper(String curr, int n, ArrayList<String> list){
    if(curr.length() == n){
        list.add(curr);
        return;
    }
    helper(curr + "0", n, list);
    helper(curr + "1", n, list);
}
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> list=new ArrayList<>();
        helper("",nums.length, list);
        HashSet<String> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i=0; i<list.size(); i++){
            if(!set.contains(list.get(i)))return list.get(i);
        }
        return "";
    }
}