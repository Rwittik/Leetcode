class Solution:
    def sumEvenAfterQueries(self, A: 'List[int]', queries: 'List[List[int]]') -> 'List[int]':
        res=[]
        total=0
        for i in A:
            if i%2==0:
                total+=i
        
        for val,idx in queries:
            prev=A[idx]
            A[idx]+=val
            if prev%2==0:
                total-=prev
            if A[idx]%2==0:
                total+=A[idx]
            res.append(total)
            
        return res
        