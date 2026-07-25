class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch-'0'>10){
                st.push(ch);
            }else{
                if(!st.isEmpty())st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}