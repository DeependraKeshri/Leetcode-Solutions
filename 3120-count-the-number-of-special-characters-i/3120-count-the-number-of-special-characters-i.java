class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<word.length(); i++){
            set.add(word.charAt(i));
        }
        int count=0;
        for(int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
            if(ch-'a'>=0){
                char c=(char)('A'+(ch-'a'));
                if(set.contains(c)){
                    count++;
                    set.remove(c);
                }
            }
        }
        return count;
    }
}