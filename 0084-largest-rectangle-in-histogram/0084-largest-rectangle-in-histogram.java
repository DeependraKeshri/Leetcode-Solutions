class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=-1;
        int n=heights.length;
        int rt[]=new int[n];
        int lt[]=new int[n];
        Stack<Integer> st=new Stack<>();
        rt[n-1]=n;
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())rt[i]=n;
            else rt[i]=st.peek();
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        lt[0]=-1;
        st.push(0);
        for(int i=1; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())lt[i]=-1;
            else lt[i]=st.peek();
            st.push(i);
        }
        for(int i=0; i<n; i++){
            int area=heights[i]*(rt[i]-lt[i]-1);
            max=Math.max(max,area);
        }
        return max;
    }
}