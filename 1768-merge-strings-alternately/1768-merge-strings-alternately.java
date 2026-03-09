class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        StringBuilder sb=new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i==word1.length()){
            sb.append(word2.substring(j));
        }else{
            sb.append(word1.substring(i));
        }
        return sb.toString();
    }
}