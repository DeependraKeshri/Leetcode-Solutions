class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0, count=columnTitle.length()-1;
        for(int i=0; i<columnTitle.length(); i++){
            double val=columnTitle.charAt(i)-'A'+1;
            val*=Math.pow(26,count);
            ans+=val;
            count--;
        }
        return ans;
    }
}