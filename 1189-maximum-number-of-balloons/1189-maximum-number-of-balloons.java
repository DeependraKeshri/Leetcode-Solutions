class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int b=0, a=0, l=0, o=0,n=0;
        for(int i=0; i<text.length(); i++){
            char ch=text.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int count=Integer.MAX_VALUE;
        String s="ablon";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(!mp.containsKey(ch))return 0;
            int val=mp.get(ch);
            if(ch=='a' || ch=='b' || ch=='n'){
                if(count>val)count=val;
            }else if(ch=='l' || ch=='o'){
                val/=2;
                if(count>val)count=val;
            }
        }
        return count;
    }
}