class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i),i);
        }
        int sum=0;
        for(int i=0; i<t.length(); i++){
            sum+=Math.abs(i-mp.get(t.charAt(i)));
        }
        return sum;
    }
}