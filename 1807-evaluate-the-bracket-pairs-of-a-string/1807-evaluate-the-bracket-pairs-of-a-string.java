class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> mp=new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            mp.put((knowledge.get(i).get(0)), (knowledge.get(i).get(1)));
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='('){
                int j=i+1;
                while(j<s.length() && s.charAt(j)!=')'){
                    j++;
                }
                String str=s.substring(i+1, j);
                if(mp.containsKey(str)){
                    sb.append(mp.get(str));
                }else{
                    sb.append('?');
                }
                i=j;
            }else{
                sb.append(ch);
            }
            i++;
        }
        return sb.toString();
    }
}