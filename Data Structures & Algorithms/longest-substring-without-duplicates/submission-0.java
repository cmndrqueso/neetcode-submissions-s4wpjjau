class Solution {
    public int lengthOfLongestSubstring(String s) {

      Set<Character> seen = new HashSet<>();
      int results = 0;
      int l = 0;
      for(int r = 0; r <s.length();r++) {
        char currChar = s.charAt(r);
        while(seen.contains(currChar)) {
          seen.remove(s.charAt(l));
          l++;
        }
        seen.add(currChar);
        results = Math.max(results, r-l+1);
      }
      return results;
    }
}
