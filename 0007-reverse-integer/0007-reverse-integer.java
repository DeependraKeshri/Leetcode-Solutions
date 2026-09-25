class Solution {
    public int reverse(int x) {
        long rev=0;
        boolean sign=false;
        if(x<0)sign=true;
        x=Math.abs(x);
        while(x>0){
            if(rev>Integer.MAX_VALUE)return 0;
            rev*=10;
            rev+=(x%10);
            x/=10;
        }
        if(sign)rev*=(-1);
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)return 0;
        return (int)rev;
    }
}