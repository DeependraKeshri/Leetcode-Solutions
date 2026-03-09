class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            String str=words[i];
            int s=0, e=str.length()-1;
            while(s<e){
                if(str.charAt(s)!=str.charAt(e))break;
                s++;
                e--;
            }
            if(s>=e)return str;
        }
        return "";
    }
}