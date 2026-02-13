class Solution {
    public int maxDistinct(String s) {
        boolean arr[]=new boolean[26];
        int count=0;
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            if(!arr[idx]){
                arr[idx]=true;
                count++;
            }
        }
        return count;
    }
}