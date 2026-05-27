class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        int n=word.length();
        Character arr[]=new Character[26];
        for(int i=0; i<26; i++){
            arr[i]=(char)('a'+i);
        }
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<n; i++){
            char ch=word.charAt(i);
            int val=ch-'A';
            boolean valid=false;
            if(!set.contains(ch) && val<26){
                for(int j=0; j<i; j++){
                    if(word.charAt(j)==arr[val]){
                        valid=true;
                        break;
                    }
                }
                if(valid){
                    for(int j=n-1; j>i; j--){
                        if(word.charAt(j)==arr[val]){
                            valid=false;
                            break;
                        }
                    }
                }
                set.add(ch);
                if(valid)count++;
            }
        }
        return count;
    }
}