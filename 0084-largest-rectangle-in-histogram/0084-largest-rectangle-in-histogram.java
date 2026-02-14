class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int nse[]=new int[n];
        int pse[]=new int[n];
        st.push(n-1);
        nse[n-1]=n;
        pse[0]=-1;
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        while(!st.isEmpty())st.pop();
        st.push(0);
        for(int i=1; i<=n-1; i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int max=0;
        for(int i=0; i<n; i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            max=Math.max(area, max);
        }
        return max;
    }
}