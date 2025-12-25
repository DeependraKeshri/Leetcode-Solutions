class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum=0;
        long c=0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1; i>=0; i--){
            long m=happiness[i]-c;
            if(m<0 || k<=0){
                return sum;
            }else{
                sum+=m;
            }
            c++;
            k--;
        }
        return sum;
    }
}