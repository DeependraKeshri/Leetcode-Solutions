class Solution {
    public int minOperations(String s) {
        int count=0, c=0;
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                sb.append("1");
                sb1.append("0");
            }else{
                sb.append("0");
                sb1.append("1");
            }
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=sb.charAt(i))count++;
            if(s.charAt(i)!=sb1.charAt(i))c++;
        }
        return Math.min(count, c);
    }
}