class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0, sqsum=0;
        while(n>0){
            int val=n%10;
            n/=10;
            sum+=val;
            sqsum+=(val*val);
        }
        return sqsum-sum>=50;
    }
}