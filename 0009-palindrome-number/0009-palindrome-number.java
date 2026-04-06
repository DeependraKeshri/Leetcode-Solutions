class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int n=0, num=x;
        while(num>0){
            n=n*10+(num%10);
            num/=10;
        }
        return x==n;
    }
}