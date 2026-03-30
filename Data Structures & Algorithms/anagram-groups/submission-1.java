class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> seen = new HashMap<>();
        for( String str: strs) {
          int[] count = new int[26];
          for (char c: str.toCharArray()) {
            count[ c - 'a' ]++;
          }
          String key = Arrays.toString(count);
          seen.putIfAbsent(key, new ArrayList<>());
          seen.get(key).add(str);
        }
        // return as two d array
        return new ArrayList<>(seen.values()); 
    }
}
