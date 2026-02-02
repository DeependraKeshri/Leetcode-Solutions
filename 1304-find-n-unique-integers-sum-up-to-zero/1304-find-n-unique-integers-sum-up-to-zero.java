class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];
        int val=n/2;
        val*=(-1);
        if(n%2==0){
            for(int i=0; i<n; i++){
                if(val==0)val++;
                ans[i]=val;
                val++;
            }
        }else{
            for(int i=0; i<n; i++){
                ans[i]=val;
                val++;
            }
        }
        return ans;
    }
}