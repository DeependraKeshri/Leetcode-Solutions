class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> st=new HashSet<>();
        for(int i=0; i<jewels.length(); i++){
            char ch=jewels.charAt(i);
            st.add(ch);
        }
        int c=0;
        for(int i=0; i<stones.length(); i++){
            char ch=stones.charAt(i);
            if(st.contains(ch))c++;
        }
        return c;
    }
}