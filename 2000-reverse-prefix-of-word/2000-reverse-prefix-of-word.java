class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=word.indexOf(ch);
        if(idx<=0)return word;
        StringBuilder s=new StringBuilder(word.substring(0,idx+1));
        StringBuilder str=s.reverse();
        str.append(word.substring(idx+1));
        return str.toString();
    }
}