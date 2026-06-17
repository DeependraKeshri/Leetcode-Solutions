class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=0, idx=i;
                while(j<needle.length() && idx<haystack.length()){
                    if(haystack.charAt(idx)!=needle.charAt(j))break;
                    idx++;
                    j++;
                }
                if(j==needle.length())return i;
            }
        }
        return -1;
    }
}