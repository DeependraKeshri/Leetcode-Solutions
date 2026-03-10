class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        res = []
        arr = [0] * 26
        for i in range(len(s)):
            arr[ord(s[i]) - ord('a')] = i
        i = 0
        j = -1
        index = 0
        while i < len(s):
            if arr[ord(s[i]) - ord('a')] > j:
                j = arr[ord(s[i]) - ord('a')]
            if i == j:
                res.append(i - index + 1)
                index = i + 1
            i += 1
        return res