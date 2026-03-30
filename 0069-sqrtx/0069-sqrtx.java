class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        int s=1, e=x;
        while(s<=e){
            int mid=(e+s)/2;
            if(mid==x/mid)return mid;
            else if(mid<x/mid)s=mid+1;
            else e=mid-1;
        }
        return e;
    }
}