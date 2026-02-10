class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> mp=new HashMap<>();
        int c=0;
        for(int i=0; i<key.length(); i++){
            char ch=key.charAt(i);
            if(!mp.containsKey(ch) && ch!=' '){
                mp.put(ch,(char)('a'+c));
                c++;
            }
        }
        String ans="";
        for(int i=0; i<message.length(); i++){
            char ch=message.charAt(i);
            if(ch!=' '){
                ans+=mp.get(ch);
            }else{
                ans+=ch;
            }
        }
        return ans;
    }
}