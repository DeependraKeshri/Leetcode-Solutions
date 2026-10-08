class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(c>0){
                    ans+=ch;
                }
                c++;
            }else{
                c--;
                if(c>0){
                    ans+=ch;
                }
            }
        }
        return ans;
    }
}