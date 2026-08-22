class Solution {
    public boolean checkDivisibility(int n) {
        int v=n;
        int prod=1, sum=0;
        while(v>0){
            int val=v%10;
            v/=10;
            prod*=val;
            sum+=val;
        }
        sum+=prod;
        return n%sum==0;
    }
}