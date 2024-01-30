class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        dict={'(':')','{':'}','[':']'}
        for c in s:
            if c in dict:
                stack.append(c)
            elif len(stack)>0 and c==dict[stack[-1]]:
                stack.pop()
            else:
                return False
        return len(stack)==0
