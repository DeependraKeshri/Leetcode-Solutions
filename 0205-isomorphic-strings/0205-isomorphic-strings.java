class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character, Character> mp=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(mp.containsKey(ch1)){
                if(mp.get(ch1)!=ch2)return false;
            }else if(mp.containsValue(ch2)){
                return false;
            }else{
                mp.put(ch1,ch2);
            }
        }
        return true;
    }
}