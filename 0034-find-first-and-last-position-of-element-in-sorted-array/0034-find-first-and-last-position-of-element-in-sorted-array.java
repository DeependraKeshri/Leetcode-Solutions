class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        int s = 0, e = nums.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(nums[mid] == target){
                first = mid;
                e = mid - 1;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        s = 0;
        e = nums.length - 1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(nums[mid] == target){
                last = mid;
                s = mid + 1;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return new int[]{first, last};
    }
}