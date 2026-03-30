class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int window = s1.length();
        boolean res = false;
        char[] s1Window = s1.toCharArray();
        Arrays.sort(s1Window);
        if (s1.length() > s2.length()) { return false;}

        for (int i = 0; i + window < s2.length() + 1; i++) {
          String currString = s2.substring(i, i + window);
          char[] s2Window = currString.toCharArray();
          Arrays.sort(s2Window);
          if(Arrays.equals(s1Window,s2Window)) {
            return true;
          }
        }
        return res;
    }
}
