class MinStack {
    int mini=Integer.MAX_VALUE;
    Stack<Integer> st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(st.peek()<mini)mini=st.peek();
    }
    
    public void pop() {
        int x=st.pop();
        if(x==mini){
            mini=Integer.MAX_VALUE;
            Stack<Integer> t=new Stack<>();
            while(!st.isEmpty())t.push(st.pop());
            while(!t.isEmpty()){
                st.push(t.pop());
                if(mini>st.peek())mini=st.peek();
            }
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */