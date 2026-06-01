class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        Arrays.sort(cost);
        int i=cost.length-1;
        while(i>=0){
            if(i-1<0){
                sum+=cost[i];
                break;
            }
            sum+=(cost[i]+cost[i-1]);
            i-=3;
        }
        return sum;
    }
}