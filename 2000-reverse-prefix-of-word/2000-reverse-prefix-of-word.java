class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st=new Stack<>();
        int i=0;
        int n=word.length();
        boolean found=false;
        while(i<n){
            st.push(word.charAt(i));
            if(word.charAt(i)==ch){
                found=true;
                break;
            }
            i++;
        }
        if(found==false)return word;
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        for(int j=i+1; j<n; j++){
            sb.append(word.charAt(j));
        }
        return sb.toString();
    }
}