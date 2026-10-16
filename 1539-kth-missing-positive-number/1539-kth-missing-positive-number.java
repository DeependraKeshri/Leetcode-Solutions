class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s=0, e=arr.length-1, val=0;
        while(s<=e){
            int m=s+(e-s)/2;
            val=arr[m]-m-1;
            if(val<k){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        if(e==-1)return k;
        int ans=arr[e]+(k-(arr[e]-e-1));
        return ans;
    }
}