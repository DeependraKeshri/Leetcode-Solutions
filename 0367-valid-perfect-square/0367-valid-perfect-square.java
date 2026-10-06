class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1, e=num;
        while(s<=e){
            int m=s+(e-s)/2;
            long p=(long)m*m;
            if(p==num)return true;
            else if(p>num)e=m-1;
            else s=m+1;
        }
        return false;
    }
}