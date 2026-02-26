class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0; i<words.length; i++){
            String s=words[i];
            int j=0;
            while(j<s.length()){
                if(allowed.indexOf(s.charAt(j))==-1)break;
                j++;
            }
            if(j==s.length())count++;
        }
        return count;
    }
}