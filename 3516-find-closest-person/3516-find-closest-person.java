class Solution {
    public int findClosest(int x, int y, int z) {
        int d=Math.abs(z-x);
        int di=Math.abs(z-y);
        if(d==di)return 0;
        if(d<di)return 1;
        return 2;
    }
}