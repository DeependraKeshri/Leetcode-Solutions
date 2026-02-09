class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int i=0; i<stones.length(); i++){
            char ch=stones.charAt(i);
            if(jewels.indexOf(ch)!=-1)c++;
        }
        return c;
    }
}