class MyHashSet {
    ListNode head=new ListNode(0);
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        ListNode temp=head;
        boolean valid=true;
        while(temp.next!=null){
            if(key==temp.next.val)valid=false;
            temp=temp.next;
        }
        if(valid)temp.next=new ListNode(key);
    }
    
    public void remove(int key) {
        ListNode temp=head;
        ListNode t=temp.next;
        while(t!=null){
            if(t.val==key){
                temp.next=t.next;
                break;
            }
            temp=temp.next;
            t=t.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val==key)return true;
            temp=temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */