class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs[0].length();
        for(int i=0; i<strs.length; i++){
            if(n>strs[i].length())n=strs[i].length();
        }
        String s="";
        for(int i=0; i<n; i++){
            char ch=strs[0].charAt(i);
            int j=0;
            for(; j<strs.length; j++){
                if(strs[j].charAt(i)!=ch)break;
            }
            if(j!=strs.length)break;
            else s+=ch;
        }
        return s;
    }
}