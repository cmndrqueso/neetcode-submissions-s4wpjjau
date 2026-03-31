class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowSize = s1.length();
        int s2Size = s2.length();
        if(windowSize <= s2Size){
          int[] s1Freq = new int[26];
          int[] windowFreq = new int[26];

          // Populate the first sorted freq count and windowed freq count
          for(int i = 0; i < windowSize; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
          }

          // Populate initial matches
          int matches = 0;
          for(int i = 0; i < 26; i++) {
            if(s1Freq[i] == windowFreq[i]) {
              matches++;
            }
          }

          // Sliding window to check matches, if at anypoint the matches are 26, short circuit return true
          // Continues after previous work, starts at window end
          int l = 0;
          for(int r = s1.length(); r < s2.length(); r++){
            if(matches == 26) {
              return true;
            }

            int index = s2.charAt(r) - 'a';
            windowFreq[index]++;
            if(s1Freq[index] == windowFreq[index]) {
              matches++;
            } else if(s1Freq[index] + 1 == windowFreq[index]) {
              matches--;
            }

            index = s2.charAt(l) - 'a';
            windowFreq[index]--;
            if (s1Freq[index] == windowFreq[index]) {
              matches++;
            } else if(s1Freq[index] - 1 == windowFreq[index]) {
              matches--;
            }
            l++;
          }
        return matches == 26;
        }
      return false;
    }
}
