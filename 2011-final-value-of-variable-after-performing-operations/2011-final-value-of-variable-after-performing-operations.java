class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val=0;
        for(int i=0; i<operations.length; i++){
            String s=operations[i];
            if(s.equals("--X") || s.equals("X--"))val--;
            else val++;
        }
        return val;
    }
}