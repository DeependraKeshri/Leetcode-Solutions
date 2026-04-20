class Solution {
    public int maxDistance(int[] colors) {
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<colors.length; i++){
            for(int j=colors.length-1; j>i; j--){
                if(colors[j]!=colors[i] && j-i>ans)ans=j-i;
            }
        }
        return ans;
    }
}