class Solution:
    def interpret(self, command: str) -> str:
        s=command.replace("()",'o')
        st=s.replace("(al)","al")
        return st