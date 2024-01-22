class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        col0 = 1
        n = len(matrix)
        m = len(matrix[0])
        for i in range(n):
            for j in range(m):
                if(matrix[i][j] == 0):
                    matrix[i][0] = 0
                    
                    if j!=0:
                        matrix[0][j] = 0
                    else:
                        col0 = 0
        
        for i in range(1,n):
            for j in range(1,m):
                if(matrix[i][j] != 0):
                    if (matrix[i][0] == 0 or matrix[0][j] == 0):
                        matrix[i][j] = 0
        
        if matrix[0][0] == 0:
            for j in range(m):
                matrix[0][j] = 0
        
        if col0 == 0:
            for i in range(n):
                matrix[i][0] = 0
        return matrix
        
        