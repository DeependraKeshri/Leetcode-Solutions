class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch==')'){
                Queue<Character> q=new ArrayDeque<>();
                while(!st.isEmpty() && st.peek()!='('){
                    q.add(st.pop());
                }
                st.pop();
                while(!q.isEmpty()){
                    st.push(q.remove());
                }
            }else{
                st.push(ch);
            }
        }
        String str="";
        while(!st.isEmpty()){
            str=st.pop()+str;
        }
        return str;
    }
}