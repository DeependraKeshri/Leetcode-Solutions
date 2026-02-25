class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int ans[]=new int[n];
        int j=0;
        for(int i=0; i<order.length; i++){
            for(int k=0; k<friends.length; k++){
                if(order[i]==friends[k]){
                    ans[j++]=order[i];
                    break;
                }
            }
        }
        return ans;
    }
}