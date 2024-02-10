class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        s_fold="".join((s[1:],s[:-1]))
        print(s_fold)
        return s in s_fold
