class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int result = 0;
        int l = 0;
        // int window = s.length() - k;
        // If window - countOfHighestOccuringChar <=k valid
        int maxF = 0;
        for (int r = 0; r < s.length(); r++) {
          
          char currChar = s.charAt(r);
          freq.putIfAbsent(currChar, 0);
          int currFreq = freq.get(currChar) + 1;
          freq.put(currChar,currFreq);

          while(r - l + 1 - Collections.max(freq.values()) > k) {
            char leftC = s.charAt(l);
            freq.put(leftC, freq.get(leftC) - 1);
            l++;
          }
        result = Math.max(result, r - l + 1);
        }
      return result;
    }
}
