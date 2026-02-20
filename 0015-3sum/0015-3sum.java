class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int s=nums[i];
            int l=i+1, r=nums.length-1;
            while(l<r){
                int sum=nums[l]+nums[r];
                if(sum+s==0){
                    List<Integer> li=Arrays.asList(nums[i], nums[l], nums[r]);
                    if(!set.contains(li)){
                        set.add(li);
                        list.add(li);
                    }
                    l++;
                    r--;
                }else if(sum+s>0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return list;
    }
}