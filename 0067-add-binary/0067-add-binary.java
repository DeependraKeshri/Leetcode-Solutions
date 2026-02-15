class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int ea=a.length()-1;
        int eb=b.length()-1;
        
        while(ea>=0 && eb>=0){
            int ca=a.charAt(ea)-'0';
            int cb=b.charAt(eb)-'0';
            int val=ca+cb+carry;
            if(val==2){
                sb.insert(0,'0');
                carry=1;
            }else{
                sb.insert(0,(char)((val%2)+'0'));
                if(val==3)carry=1;
                else carry=0;
            }
            ea--;
            eb--;
        }

        while(ea>=0){
            int ca=a.charAt(ea)-'0';
            int val=ca+carry;
            sb.insert(0,(char)((val%2)+'0'));
            carry=val/2;
            ea--;
        }

        while(eb>=0){
            int cb=b.charAt(eb)-'0';
            int val=cb+carry;
            sb.insert(0,(char)((val%2)+'0'));
            carry=val/2;
            eb--;
        }

        if(carry==1)sb.insert(0,'1');
        
        String ans=sb.toString();
        return ans;
    }
}
