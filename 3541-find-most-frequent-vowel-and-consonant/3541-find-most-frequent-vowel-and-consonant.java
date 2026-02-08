class Solution {
    public int maxFreqSum(String s) {
       HashMap<Character,Integer> mp=new HashMap<>(); 
       for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(!mp.containsKey(ch)){
            mp.put(ch,1);
        }else{
            mp.put(ch,mp.get(ch)+1);
        }
       }
       int vol=0;
       int con=0;
       for(char ch:mp.keySet()){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            if(mp.get(ch)>vol)vol=mp.get(ch);
        }else{
            if(mp.get(ch)>con)con=mp.get(ch);
        }
       }
       return vol+con;
    }
}