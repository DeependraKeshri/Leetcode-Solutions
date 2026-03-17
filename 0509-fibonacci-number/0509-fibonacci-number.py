class Solution:
    def helper(self, arr, n):
        if arr[n] != -1:
            return arr[n]
        arr[n] = self.helper(arr, n-1) + self.helper(arr, n-2)
        return arr[n]

    def fib(self, n: int) -> int:
        arr = [-1] * (n + 1)
        arr[0] = 0
        if n > 0:
            arr[1] = 1
        return self.helper(arr, n)