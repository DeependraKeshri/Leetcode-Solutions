class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>list=new ArrayList<>();
        String str="";
        for(int i=0; i<words.length; i++){
            char arr[]=words[i].toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(!s.equals(str)){
                str=s;
                list.add(words[i]);
            }
        }
        return list;
    }
}