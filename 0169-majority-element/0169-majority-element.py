class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        counter = Counter(nums)
        n = len(nums)
        
        for num, count in counter.items():
            if count > (n//2):
                return num
        return -1
        