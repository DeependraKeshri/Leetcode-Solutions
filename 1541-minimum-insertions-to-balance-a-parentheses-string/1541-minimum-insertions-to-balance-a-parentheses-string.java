class Solution {
    public int minInsertions(String s) {
        int lc=0, count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                lc++;
            }else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    if(lc>0){
                        lc--;
                    }else{
                        count++;
                    }
                    i++;
                }else{
                    if(lc>0){
                        lc--;
                        count++;
                    }else{
                        count+=2;
                    }
                }
            }
        }
        count+=2*lc;
        return count;
    }
}