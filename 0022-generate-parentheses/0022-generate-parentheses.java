class Solution {
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(0, 0, "", n);
        return list;
    }
    public void helper(int i, int j, String s, int n){
        if(i==n && j==n){
            list.add(new String(s));
            return;
        }
        if(i<n)helper(i+1, j,s+'(', n);
        if(j<i)helper(i, j+1, s+')', n);
    }
}