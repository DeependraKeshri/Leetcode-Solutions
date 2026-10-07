class Solution {
    Set<String> set = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int open = 0;
        int close = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else if(ch==')'){
                if(open>0){
                    open--;
                }else{
                    close++;
                }
            }
        }
        helper(s, 0, open, close);
        return new ArrayList<>(set);
    }
    public void helper(String s, int index, int open, int close) {
        if(open==0 && close==0){
            if(isValid(s)){
                set.add(s);
            }
            return;
        }
        for(int i=index;i<s.length();i++){
            if(i>index && s.charAt(i)==s.charAt(i-1)){
                continue;
            }
            if(close>0 && s.charAt(i)==')'){
                helper(
                    s.substring(0,i)+s.substring(i+1),
                    i,
                    open,
                    close-1
                );
            }
            if(open>0 && s.charAt(i)=='('){
                helper(
                    s.substring(0,i)+s.substring(i+1),
                    i,
                    open-1,
                    close
                );
            }
        }
    }
    public boolean isValid(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }else if(ch==')'){
                count--;
                if(count<0){
                    return false;
                }
            }
        }
        return count==0;
    }
}