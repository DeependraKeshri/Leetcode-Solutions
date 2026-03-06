class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int lc=0, rc=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='R')rc++;
            else lc++;
            if(lc==rc){
                count++;
                lc=0;
                rc=0;
            }
        }
        return count;
    }
}