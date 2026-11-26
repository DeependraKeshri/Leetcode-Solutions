class Solution {
    public boolean canAliceWin(int n) {
        int count=10, turn=1;
        while(count<=n){
            if(turn==1){
                turn=0;
                n-=count;
                count--;
            }else{
                turn=1;
                n-=count;
                count--;
            }
        }
        return turn==0;
    }
}