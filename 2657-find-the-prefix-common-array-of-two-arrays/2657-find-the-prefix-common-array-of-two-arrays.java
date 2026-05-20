class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count=0;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        int n=A.length;
        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            set1.add(B[i]);
            set2.add(A[i]);
            if(A[i]==B[i])count++;
            else{
                if(set1.contains(A[i]))count++;
                if(set2.contains(B[i]))count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}