class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(st.isEmpty() && ch==')')count++;
            else if(ch=='(')st.push(ch);
            else st.pop();
        }
        count+=st.size();
        return count;
    }
}