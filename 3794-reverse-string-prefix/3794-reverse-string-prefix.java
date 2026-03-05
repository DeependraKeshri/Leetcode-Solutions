class Solution {
    public String reversePrefix(String s, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<k; i++){
            st.push(s.charAt(i));
        }
        String str="";
        while(!st.isEmpty()){
            str+=st.pop();
        }
        str+=s.substring(k);
        return str;
    }
}