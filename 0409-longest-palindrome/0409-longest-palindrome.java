class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char ele:mp.keySet()){
            int val=(int)(mp.get(ele));
            count+=(2*(val/2));
        }
        if(count<s.length())count++;
        return count;
    }
}