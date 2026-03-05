class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp=new HashMap<>();;
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        char ch=s.charAt(s.length()-1);
        int val=0;
        for(int i=s.length()-1; i>=0; i--){
            char c=s.charAt(i);
            if(mp.get(ch)>mp.get(c)){
                val-=mp.get(c);
            }else{
                val+=mp.get(c);
                ch=c;
            }
        }
        return val;
    }
}