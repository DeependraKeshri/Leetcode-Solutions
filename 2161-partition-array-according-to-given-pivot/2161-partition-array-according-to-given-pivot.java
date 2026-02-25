class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> ft=new ArrayList<>();
        List<Integer> md=new ArrayList<>();
        List<Integer> lt=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot)ft.add(nums[i]);
            else if(nums[i]>pivot)lt.add(nums[i]);
            else md.add(nums[i]);
        }   
        int j=0;
        for(int i=0; i<ft.size(); i++)nums[j++]=ft.get(i);
        for(int i=0; i<md.size(); i++)nums[j++]=md.get(i);
        for(int i=0; i<lt.size(); i++)nums[j++]=lt.get(i);
        return nums;
    }
}