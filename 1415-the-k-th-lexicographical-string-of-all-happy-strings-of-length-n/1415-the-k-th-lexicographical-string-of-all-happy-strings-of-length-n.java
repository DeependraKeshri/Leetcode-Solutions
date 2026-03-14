class Solution {
    public void solve(int n, String curr, List<String> list){
        if(curr.length() == n){
            list.add(curr);
            return;
        }
        char[] arr = {'a','b','c'};
        for(char ch : arr){
            if(curr.length() == 0 || curr.charAt(curr.length()-1) != ch){
                solve(n, curr + ch, list);
            }
        }
    }
    public String getHappyString(int n, int k) {
        List<String> list = new ArrayList<>();
        solve(n, "", list);
        if(k > list.size()) return "";
        return list.get(k-1);
    }
}