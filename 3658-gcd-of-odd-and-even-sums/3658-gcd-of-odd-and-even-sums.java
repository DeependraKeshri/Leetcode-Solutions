class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=2, odd=1;
        int evenSum=0, oddSum=0;
        for(int i=0; i<n; i++){
            evenSum+=even;
            oddSum+=odd;
            even+=2;
            odd+=2;
        }
        if(evenSum>=oddSum){
            return gcd(evenSum, oddSum);
        }else{
            return gcd(oddSum, evenSum);
        }
    }
    public int gcd(int a, int b){
        if(a==b)return b;
        while(b>0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}