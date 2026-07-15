class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character, Integer> mp1=new HashMap<>();
        HashMap<Character, Integer> mp2=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char c=t.charAt(i);
            mp2.put(c,mp2.getOrDefault(c,0)+1);
        }
        return mp1.equals(mp2);
    }
}