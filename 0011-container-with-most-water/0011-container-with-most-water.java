class Solution {
    public int maxArea(int[] height) {
       int s=0, e=height.length-1;
       int maxWater=0;
       while(s<e){
        int prod=Math.min(height[s],height[e])*(e-s);
        maxWater=Math.max(maxWater, prod);
        if(height[s]<height[e]){
            s++;
        }else{
            e--;
        }
       }
       return maxWater;
    }
}