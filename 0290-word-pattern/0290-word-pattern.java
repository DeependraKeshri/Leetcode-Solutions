class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mp=new HashMap<>();
        String arr[]=s.split(" ");
        HashSet<String> set=new HashSet<>();
        if(pattern.length()!=arr.length)return false;
        for(int i=0; i<pattern.length(); i++){
            char ch=pattern.charAt(i);
            if(!mp.containsKey(ch)){
                if(set.contains(arr[i]))return false;
                mp.put(ch, arr[i]);
                set.add(arr[i]);
            }else if(mp.containsKey(ch) && !mp.get(ch).equals(arr[i]))return false;
        }
        return true;
    }
}