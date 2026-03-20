class Solution {
    public int totalMoney(int n) {
        int q=n/7;
        int r=n%7;
        int sum=0;
        if(q>0){
            sum+=28*q;
            for(int i=1; i<q; i++){
                sum+=(7*i);
            }
        }
        for(int i=0; i<r; i++){
            q++;
            sum+=q;
        }
        return sum;
    }
}