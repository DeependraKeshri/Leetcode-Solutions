class Solution {
    public int pivotInteger(int n) {
        long totSum=(long)(n*(n+1))/2;
        int suffsum=0;
        for(int i=n; i>=0; i--){
            suffsum+=i;
            if(totSum==suffsum)return i;
            totSum-=i;
        }
        return -1;
    }
}