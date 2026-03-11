class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String str="";
        for(int i=0; i<arr.length; i++){
            String st=arr[i];
            for(int j=st.length()-1; j>=0; j--){
                str+=st.charAt(j);
            }
            if(i!=arr.length-1)str+=' ';
        }
        return str;
    }
}