class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        if(dividend==Integer.MIN_VALUE && divisor==-1)return Integer.MAX_VALUE;
        if(divisor==1)return dividend;
        boolean isPositive=!((dividend>=0 && divisor<0) || (dividend<0 && divisor>0));
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long ans=0;
        while(n>=d){
            long temp=d, multiple=1;
            while(n>=temp<<1){
                temp<<=1;
                multiple<<=1;
            }
            n-=temp;
            ans+=multiple;
        }
        if(ans>Integer.MAX_VALUE)return isPositive? Integer.MAX_VALUE : Integer.MIN_VALUE;
        return isPositive? (int)ans:(int)-ans;
    }
}