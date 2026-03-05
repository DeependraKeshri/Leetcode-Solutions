class Solution:
    def defangIPaddr(self, address: str) -> str:
        s=""
        for i in address:
            if i=='.':
                s+="[.]"
            else:
                s+=i
        return s