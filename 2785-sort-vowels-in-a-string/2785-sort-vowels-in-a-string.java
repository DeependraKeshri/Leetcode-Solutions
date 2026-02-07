class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                list.add(ch);
            }
        }
        Collections.sort(list);
        String ans="";
        int j=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                ans+=list.get(j);
                j++;
            }else{
                ans+=ch;
            }
        }
        return ans;
    }
}