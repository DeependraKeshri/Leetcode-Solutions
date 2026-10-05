class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(0);
            }else{
                int val=st.pop();
                if(val==0){
                    val=1;
                }else{
                    val=2*val;
                }
                st.push(st.pop()+val);
            }
        }
        return st.pop();
    }
}