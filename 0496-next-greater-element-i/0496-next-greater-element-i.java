class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n2=nums2.length;
        int n1=nums1.length;
        int arr[]=new int[n2];
        Stack<Integer> st=new Stack<>();
        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(nums2[n2-1],-1);
        st.push(nums2[n2-1]);
        for(int i=n2-2; i>=0; i--){
            while(!(st.isEmpty()) && st.peek()<nums2[i]){
                st.pop();
            }
            if(st.isEmpty())mp.put(nums2[i],-1);
            else mp.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }
        for(int i=0; i<n1; i++){
            nums1[i]=mp.get(nums1[i]);
        }
        return nums1;
    }
}