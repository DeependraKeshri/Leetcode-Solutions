class Solution {
    public int maximumLengthSubstring(String s) {
        int len=0;
        for(int i=0; i<s.length(); i++){
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int j=i; j<s.length(); j++){
                char ch=s.charAt(j);
                if(!mp.containsKey(ch)){
                    mp.put(ch,1);
                }else{
                    if(mp.get(ch)==2){
                        break;
                    }else{
                        mp.put(ch,2);
                    }
                }
                len=Math.max(len,j-i+1);
            }
        }
        return len;
    }
}