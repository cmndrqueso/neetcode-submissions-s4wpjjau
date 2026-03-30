class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> seen = new HashMap<>();
        for (String str: strs) {
          // Sort string
          char[] chars = str.toCharArray();
          Arrays.sort(chars);
          String sorted = new String(chars);

          // if sorted string exists in map as key
          List<String> existingVal = seen.get(sorted);
          if (existingVal != null) {
            // Add str to value <sorted string as key, sorted as value 

            existingVal.add(str);
          } else {
          // Else: add <sorted str, string>
            List<String> newList = new ArrayList<>();
            newList.add(str);
            seen.put(sorted, newList);
          }
        }
        // return as two d array
        return new ArrayList<>(seen.values()); 
    }
}
