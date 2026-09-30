class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        Stack<Integer> st=new Stack<>();
        int n=seq.length();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            char ch=seq.charAt(i);
            if(st.isEmpty()){
                st.push(0);
                arr[i]=0;
            }else if(ch==')'){
                arr[i]=st.pop();
            }else if(st.peek()==0){
                st.push(1);
                arr[i]=1;
            }else if(st.peek()==1){
                st.push(0);
                arr[i]=0;
            }
        }
        return arr;
    }
}