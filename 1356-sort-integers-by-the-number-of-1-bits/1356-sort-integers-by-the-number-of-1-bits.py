class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        sorted_arr = sorted(arr, key=lambda x: (x.bit_count(), x))
        return sorted_arr