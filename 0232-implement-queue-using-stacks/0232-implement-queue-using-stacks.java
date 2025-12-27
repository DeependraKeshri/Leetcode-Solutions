class MyQueue {
    Stack<Integer> st=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        Stack<Integer> s=new Stack<>();
        while(st.size()>1)s.push(st.pop());
        int t=st.pop();
        while(!s.isEmpty())st.push(s.pop());
        return t;
    }
    
    public int peek() {
        Stack<Integer> s=new Stack<>();
        while(st.size()>0)s.push(st.pop());
        int t=s.peek();
        while(!s.isEmpty())st.push(s.pop());
        return t;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */