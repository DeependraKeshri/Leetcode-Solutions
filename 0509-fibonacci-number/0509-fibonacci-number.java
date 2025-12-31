class Solution {
    public int fib(int n) {
        //Tabulation
        if(n==0 || n==1)return n;
        int fibo[]=new int[n+1];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2; i<n+1; i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        return fibo[n];
    }
}