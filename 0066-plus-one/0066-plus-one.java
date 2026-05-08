class Solution {
    public int[] plusOne(int[] digits) {
        int val=digits[digits.length-1]+1;
        int carry=val/10;
        ListNode temp=new ListNode(val%10);
        for(int i=digits.length-2; i>=0; i--){
            int v=digits[i]+carry;
            carry=v/10;
            ListNode t=new ListNode(v%10);
            t.next=temp;
            temp=t;
        }
        int size=digits.length;
        if(carry==1){
            ListNode t=new ListNode(1);
            t.next=temp;
            temp=t;
            size++;
        }
        ListNode dummy=temp;
        int ans[]=new int[size];
        int i=0;
        while(dummy!=null){
            ans[i++]=dummy.val;
            dummy=dummy.next;
        }
        return ans;
    }
}