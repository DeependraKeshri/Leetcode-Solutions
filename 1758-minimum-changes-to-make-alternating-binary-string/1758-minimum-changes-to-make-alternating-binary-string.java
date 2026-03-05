class Solution {
    public int minOperations(String s) {
        int eone=0, ezero=0, oone=0, ozero=0;
        for(int i=0; i<s.length(); i+=2){
            if(s.charAt(i)=='1') eone++;
            else ezero++;
        }
        for(int i=1; i<s.length(); i+=2){
            if(s.charAt(i)=='1') oone++;
            else ozero++;
        }
        int c=Math.min(eone+ozero, ezero+oone);
        return c;
    }
}