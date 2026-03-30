class Solution {
    public boolean isPalindrome(String s) {

      /*
      Approach 1:
        We could work with a two pointer converging from i = 0 and j = String.length()
      */
      // Clean up string 
      // Make all lowercase
      String cleanedUpString = s.toLowerCase().replaceAll("[^a-z0-9]", "");;
      int i = 0;
      int j = cleanedUpString.length()-1;
      
      while(i <= j) {
        if(cleanedUpString.charAt(i) != cleanedUpString.charAt(j)) {
          return false;
        }
        i++;
        j--;
      }

      return true;
    }
}
