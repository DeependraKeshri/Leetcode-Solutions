class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nse[]=new int[n];
        nse[n-1]=n;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())nse[i]=n;
            else   nse[i]=st.peek();
            st.push(i);
        }
        st.clear();
        int pse[]=new int[n];
        pse[0]=-1;
        st.push(0);
        for(int i=1; i<n; i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int ans=-1;
        for(int i=0; i<n; i++){
            int val=heights[i]*(nse[i]-pse[i]-1);
            if(val>ans)ans=val;
        }
        return ans;
    }
}
