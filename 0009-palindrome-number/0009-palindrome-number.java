class Solution {
    public boolean isPalindrome(int x) {
        int n=0, num=x;
        while(num>0){
            n=n*10+(num%10);
            num/=10;
        }
        return x==n;
    }
}