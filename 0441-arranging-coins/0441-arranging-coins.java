class Solution {
    public int arrangeCoins(int n) {
        int i=0, j=1;
        while(n>=j){
            n-=j;
            j++;
            i++;
        }
        return i;
    }
}