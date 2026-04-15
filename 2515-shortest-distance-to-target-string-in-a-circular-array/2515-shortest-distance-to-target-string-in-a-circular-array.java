class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        boolean valid=false;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                valid=true;
                break;
            }
        }
        if(!valid) return -1;
        int s=startIndex, lt=0;
        int n=words.length;
        while(!words[s].equals(target)){
            s++;
            lt++;
            if(s==n)s=0;
        }
        s=startIndex;
        int rt=0;
        while(!words[s].equals(target)){
            rt++;
            s--;
            if(s==-1)s=n-1;
        }
        return Math.min(lt,rt);
    }
}