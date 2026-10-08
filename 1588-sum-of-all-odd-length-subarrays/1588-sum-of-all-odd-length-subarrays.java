class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        for(int i=1; i<arr.length; i++){
            arr[i]+=arr[i-1];
        }
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j+=2){
                if(i==0)sum+=arr[j];
                else sum+=(arr[j]-arr[i-1]);
            }
        }
        return sum;
    }
}