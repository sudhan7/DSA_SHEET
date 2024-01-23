class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        maxi, curr= float('-inf'), 0
        for i in range(n):
            curr += nums[i]
            maxi = max(maxi, curr)
            curr = max(curr, 0)
        return maxi