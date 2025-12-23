class Solution {
    public int maxDepth(String s) {
       int max=Integer.MIN_VALUE;
       int m=0;
       Stack<Character> st=new Stack<>();
       for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(ch=='('){
            m++;
            st.push(ch);
        }else if(ch==')'){
            st.pop();
            m--;
        }
        max=Math.max(m,max);
       } 
       return max;
    }
}