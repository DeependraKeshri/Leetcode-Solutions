class MyHashMap {
    ListNode headKey=new ListNode(0);
    ListNode headValue=new ListNode(0);
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        if(headKey.next==null){
            headKey.next=new ListNode(key);
            headValue.next=new ListNode(value);
        }
        ListNode k=headKey.next;
        ListNode v=headValue.next;
        boolean valid=true;
        while(k.next!=null){
            if(k.val==key){
                valid=false;
                v.val=value;
                break;
            }
            k=k.next;
            v=v.next;
        }
        if(valid){
            if(k.val==key){
                v.val=value;
            }else{
                k.next=new ListNode(key);
                v.next=new ListNode(value);
            }
        }
    }
    
    public int get(int key) {
        ListNode k=headKey.next;
        ListNode v=headValue.next;
        while(k!=null){
            if(k.val==key)return v.val;
            k=k.next;
            v=v.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        ListNode k=headKey;
        ListNode v=headValue;
        while(k.next!=null){
            if(k.next.val==key){
                k.next=k.next.next;
                v.next=v.next.next;
                break;
            }
            k=k.next;
            v=v.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */