class Solution:
    def ncr(self,n, r):
        res = 1
        for i in range(r):
            res = res * (n-i)
            res = res // (i+1)
        return int(res)
    
    def generate(self, n: int) -> List[List[int]]:
        ans = []
        
        for row in range(1, n+1):
            temp = []
            for col in range(1, row+1):
                temp.append(self.ncr(row-1, col-1))
            ans.append(temp)
        return ans
    
    