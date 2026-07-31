class Solution {
    public int fib(int n) {
        int fib[]=new int[n+1];
        return helper(n, fib);
    }
    public int helper(int n, int fib[]){
        if(n==0 || n==1)return n;
        if(fib[n]!=0)return fib[n];
        fib[n]=helper(n-1, fib)+helper(n-2, fib);
        return fib[n];
    }
}