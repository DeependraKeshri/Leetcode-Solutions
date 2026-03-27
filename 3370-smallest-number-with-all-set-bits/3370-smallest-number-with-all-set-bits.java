class Solution {
    public int smallestNumber(int n) {
        String s=Integer.toBinaryString(n);
        return (int)Math.pow(2,s.length())-1;
    }
}