class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        n = len(nums)
        count1 = 0
        count2 = 0
        ele1 ,ele2 = float('-inf'), float('-inf')
        
        for i in range(n):
            if count1 == 0 and ele2 != nums[i]:
                count1 = 1
                ele1 = nums[i]
            elif count2 == 0 and ele1 != nums[i]:
                count2 = 1
                ele2 = nums[i]
            elif nums[i] == ele1:
                count1 += 1
            elif nums[i] == ele2:
                count2 += 1
            else:
                count1 -= 1
                count2 -= 1
        
        res = []    
        count1 , count2 = 0,0
        for i in range(n):
            if nums[i] == ele1:
                count1 += 1
            if nums[i] == ele2:
                count2 += 1
        mini = n//3 + 1
        
        if count1 >= mini:
            res.append(ele1)
        if count2 >= mini:
            res.append(ele2)
        return res