class Solution {
    public long countCommas(long n) {
        long count=0, base=1000;
        while(base<=n){
            count+=(n-base+1);
            base*=1000;
        }
        return count;
    }
}