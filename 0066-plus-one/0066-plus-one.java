class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> st=new Stack<>();
        int v=digits[digits.length-1]+1;
        st.push(v%10);
        int carry=v/10;
        for(int i=digits.length-2; i>=0; i--){
            int val=digits[i]+carry;
            st.push(val%10);
            carry=val/10;
        }
        if(carry==1)st.push(1);
        int ans[]=new int[st.size()];
        int i=0;
        while(!st.isEmpty()){
            ans[i++]=st.pop();
        }
        return ans;
    }
}