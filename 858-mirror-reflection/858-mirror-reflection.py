class Solution:
    def mirrorReflection(self, p: int, q: int) -> int:
		# same?
        if p == q: return 1
		
        # if both are even, we need to keep dividing them by 2, until q becomes 1, 
		# then as we know p even and q is odd, so it first meets 2nd receptor e.g. -> 4, 2
        while p%2 == 0 and q%2 == 0:
            p = p // 2
            q = q //  2
        
        if p%2 == 0 and q%2 == 1: return 2
        elif p%2 == 1 and q%2 == 1: return 1
        elif p%2 == 1 and q%2 == 0: return 0
        