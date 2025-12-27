class MyStack {
    Queue<Integer> q=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for(int i=0; i<q.size()-1; i++){
            q.add(q.remove());
        }
        return q.remove();
    }
    
    public int top() {
        for(int i=0; i<q.size()-1; i++)q.add(q.remove());
        int t=q.peek();
        q.add(q.remove());
        return t;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */