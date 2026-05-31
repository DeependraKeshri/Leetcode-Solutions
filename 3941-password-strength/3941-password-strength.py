class Solution:
    def passwordStrength(self, password: str) -> int:
        score=0
        s=set()
        for i in password:
            if i not in s:
                if i=='!' or i=='@' or i=='#' or i=='$':
                    score+=5
                elif i in "0123456789":
                    score+=3
                elif ord(i)-ord('a')>=0:
                    score+=1
                else:
                    score+=2
                s.add(i)
        return score