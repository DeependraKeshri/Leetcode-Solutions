class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        for(int i=0; i<words.length; i++){
            String s=words[i];
            int j=0;
            while(j<s.length()){
                if(!set.contains(s.charAt(j)))break;
                j++;
            }
            if(j==s.length())count++;
        }
        return count;
    }
}