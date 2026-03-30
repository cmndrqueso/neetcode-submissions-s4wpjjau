class Solution {
    public boolean isPalindrome(String s) {

      // Clean up string 
      // Make all lowercase
      s = s.toLowerCase().replaceAll("[^a-z0-9]", "");;
      int i = 0;
      int j = s.length()-1;
      
      while(i <= j) {
        if(s.charAt(i) != s.charAt(j)) {
          return false;
        }
        i++;
        j--;
      }

      return true;
    }
}
