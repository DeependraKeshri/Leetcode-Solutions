class Solution {
    public int digitFrequencyScore(int n) {
        int arr[]=new int[10];
        int val=n;
        while(val>0){
            int v=val%10;
            arr[v]++;
            val/=10;
        }
        int sum=0;
        for(int i=0; i<10; i++){
            sum+=(arr[i]*i);
        }
        return sum;
    }
}