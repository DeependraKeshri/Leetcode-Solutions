class Solution {
    public boolean isTrionic(int[] nums) {
        int i=1;
        int n=nums.length;
        while(i<n){
            if(nums[i-1]<nums[i]){
                i++;
            }else if(i==1 || i==n-1){
                return false;
            }else{
                int j=i;
                while(j<n){
                    if(nums[j-1]>nums[j]){
                        j++;
                    }else if(j==n-1 && nums[j-1]>nums[j]){
                        return false;
                    }else{
                        int k=j;
                        while(k<n){
                            if(k==n-1 && nums[k-1]<nums[k])return true;
                            else if(nums[k-1]<nums[k]){
                                k++;
                            }else{
                                return false;
                            }
                            i++;
                            j++;
                        }
                    }
                    i++;
                }
            }
        }
        return false;
    }
}