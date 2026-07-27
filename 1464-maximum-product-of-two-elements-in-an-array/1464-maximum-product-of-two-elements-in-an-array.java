class Solution {
    public int maxProduct(int[] nums) {
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i:nums){
            if(firstMax<=i){
                secondMax=firstMax;
                firstMax=i;
            }else if(i>secondMax && i!=firstMax){
                secondMax=i;
            }
        }
        return (firstMax-1)*(secondMax-1);
    }
}