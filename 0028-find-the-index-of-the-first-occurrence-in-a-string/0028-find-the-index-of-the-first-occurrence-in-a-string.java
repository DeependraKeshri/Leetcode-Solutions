class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle))return -1;
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=1, k=i+1;
                while(j!=needle.length()){
                    if(haystack.charAt(k)!=needle.charAt(j))break;
                    j++;
                    k++;
                }
                if(j==needle.length())return i;
            }
        }
        return -1;
    }
}