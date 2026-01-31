class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        ans=""
        for i in letters:
            if i>target:
                ans=i
                break
        if len(ans)==0:
            return letters[0]
        else:
            return ans