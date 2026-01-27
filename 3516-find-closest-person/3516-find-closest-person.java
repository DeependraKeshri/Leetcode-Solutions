class Solution {
    public int findClosest(int x, int y, int z) {
        int d=Math.abs(z-x)-Math.abs(z-y);
        if(d==0)return 0;
        if(d<0)return 1;
        return 2;
    }
}