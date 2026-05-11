class Solution {
    public int[] separateDigits(int[] nums) {
        ListNode temp=new ListNode(0);
        int size=0;
        for(int i=nums.length-1; i>=0; i--){
            int val=nums[i];
            while(val>0){
                ListNode t=new ListNode(val%10);
                val/=10;
                t.next=temp;
                temp=t;
                size++;
            }
        }
        ListNode t=temp;
        int ans[]=new int[size];
        int i=0;
        while(size>0){
            ans[i++]=t.val;
            t=t.next;
            size--;
        }
        return ans;
    }
}