class Solution {
    public String[] findWords(String[] words) {
        String f1="qwertyuiop", f2="asdfghjkl", f3="zxcvbnm";
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0; i<f1.length(); i++){
            char ch=f1.charAt(i);
            mp.put(ch,1);
            mp.put((char)(ch-32), 1);
        }
        for(int i=0; i<f2.length(); i++){
            char ch=f2.charAt(i);
            mp.put(ch,2);
            mp.put((char)(ch-32), 2);
        }
        for(int i=0; i<f3.length(); i++){
            char ch=f3.charAt(i);
            mp.put(ch,3);
            mp.put((char)(ch-32), 3);
        }
        List<String> list=new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String s=words[i];
            int turn=mp.get(s.charAt(0));
            int j=1;
            for(; j<s.length(); j++){
                if(mp.get(s.charAt(j))!=turn)break;
            }
            if(j==s.length())list.add(s);
        }
        String ans[]=new String[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}