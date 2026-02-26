class Solution {
    public int numSteps(String s) {
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        int carry=0;
        while(sb.length()>1){
            int val=(sb.charAt(sb.length()-1)-48)+carry;
            if(val%2==0){
                if(val==2)carry=1;
                else carry=0;
                count++;
            }else{
                if(carry==0)carry=1;
                count+=2;
            }
            sb.deleteCharAt(sb.length()-1);
        }
        if(carry==1)count++;
        return count;
    }
}