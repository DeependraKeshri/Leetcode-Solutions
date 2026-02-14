class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')st.push(ch);
            else if(ch==')'){
                if(!st.isEmpty() && st.peek()=='(')st.pop();
                else return false;
            }else if(ch==']'){
                if(!st.isEmpty() && st.peek()=='[')st.pop();
                else return false;
            }else if(ch=='}'){
                if(!st.isEmpty() && st.peek()=='{')st.pop();
                else return false;
            }
            i++;
        }
        return st.isEmpty();
    }
}