class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(Integer.parseInt(nums[i],2));
        }
        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i)){
                String s = Integer.toBinaryString(i);
                while(s.length() < nums.length){
                    s = "0" + s;
                }
                return s;
            }
        }
        return "";
    }
}