class Solution:
    def reverseWords(self, s: str) -> str:
        st=s[len(s)-1: : -1]
        list=st.split()
        s,e=0,len(list)-1
        while(s<e):
            temp=list[s]
            list[s]=list[e]
            list[e]=temp
            s+=1
            e-=1
        ans=' '.join(list)
        return ans
