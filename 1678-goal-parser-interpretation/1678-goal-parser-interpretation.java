class Solution {
    public String interpret(String command) {
        String s="";
        for(int i=0; i<command.length(); i++){
            char ch=command.charAt(i);
            if(ch=='('){
                if(command.charAt(i+1)==')')s+='o';
                else s+="al";
            }else if(ch=='G'){
                s+='G';
            }
        }
        return s;
    }
}