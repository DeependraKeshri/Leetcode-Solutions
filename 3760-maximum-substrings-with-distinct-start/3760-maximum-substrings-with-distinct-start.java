class Solution {
    public int maxDistinct(String s) {
        boolean arr[]=new boolean[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']=true;
        }
        int count=0;
        for(int i=0; i<26; i++){
            if(arr[i])count++;
        }
        return count;
    }
}