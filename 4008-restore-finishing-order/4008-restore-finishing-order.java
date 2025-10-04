class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<friends.length; i++){
            set.add(friends[i]);
        }
        int ans[]=new int[friends.length];
        int j=0;
        for(int i=0; i<order.length; i++){
            if(set.contains(order[i])){
                ans[j]=order[i];
                j++;
            }
        }
        return ans;
    }
}