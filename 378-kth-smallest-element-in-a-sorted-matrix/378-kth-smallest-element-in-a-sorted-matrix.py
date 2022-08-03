class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        
        res = []
        
        for l in matrix:
            res += l
            
        res.sort()
        
        return res[k-1]