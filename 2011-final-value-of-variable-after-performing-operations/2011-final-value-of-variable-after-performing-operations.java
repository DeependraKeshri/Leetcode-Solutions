class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++){
            String ch=operations[i];
            if(ch.equals("++X") || ch.equals("X++"))x++;
            if(ch.equals("--X") || ch.equals("X--"))x--;
        }
        return x;
    }
}