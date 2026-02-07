class Solution {
    public String sortVowels(String s) {
        int idx[]=new int[10];
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                idx[0]+=1;
            }else if(ch=='E'){
                idx[1]+=1;
            }else if(ch=='I'){
                idx[2]+=1;
            }else if(ch=='O'){
                idx[3]+=1;
            }else if(ch=='U'){
                idx[4]+=1;
            }else if(ch=='a'){
                idx[5]+=1;
            }else if(ch=='e'){
                idx[6]+=1;
            }else if(ch=='i'){
                idx[7]+=1;
            }else if(ch=='o'){
                idx[8]+=1;
            }else if(ch=='u'){
                idx[9]+=1;
            }
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder st=new StringBuilder();

        String temp="AEIOUaeiou";
        for(int i=0; i<idx.length; i++){
            int val=idx[i];
            while(val>0){
                st.append(temp.charAt(i));
                val--;
            }
        }

        int j=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                sb.append(st.charAt(j));
                j++;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}