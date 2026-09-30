class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int turn=0, n=seq.length();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            char ch=seq.charAt(i);
            if(turn==0 && ch=='('){
                arr[i]=turn;
                turn=1;
            }else if(turn==0 && ch==')'){
                turn=1;
                arr[i]=turn;
            }else if(turn==1 && ch=='('){
                arr[i]=turn;
                turn=0;
            }else if(turn==1 && ch==')'){
                turn=0;
                arr[i]=turn;
            }
        }
        return arr;
    }
}