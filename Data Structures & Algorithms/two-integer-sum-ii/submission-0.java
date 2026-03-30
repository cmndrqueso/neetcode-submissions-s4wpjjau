class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
          int currNum = numbers[i];
          int difference = target - currNum;
          if (seen.containsKey(difference)){
            int[]results =  {seen.get(difference), (i+1)};
            return results;
          }
          seen.put(currNum, i +1);
        }
        return new int[0];
    }
}
