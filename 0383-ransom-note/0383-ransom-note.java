class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char ch=magazine.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch=ransomNote.charAt(i);
            if(!mp.containsKey(ch) || mp.get(ch)==0)return false;
            mp.put(ch, mp.get(ch)-1);
        }
        return true;
    }
}