class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sortedStringS = sorted(s)
        sortedStringT = sorted(t)
        return sortedStringS == sortedStringT
        