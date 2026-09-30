class Solution {
    public void reverseString(char[] s) {
        int st=0, e=s.length-1;
        while(st<e){
            char ch1=s[st];
            s[st]=s[e];
            s[e]=ch1;
            st++;
            e--;
        }
    }
}