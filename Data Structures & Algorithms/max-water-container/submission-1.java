class Solution {
    public int maxArea(int[] heights) {  
        int largest = 0;
        int i = 0;
        int j = heights.length-1; 
        while (i != j){
            
            int x = j - i;
            int y = Math.min(heights[i], heights[j]);
            int currSize = x*y;
            largest = Math.max(currSize,largest);
            if (heights[i] < heights[j]) {
                i ++;
            } else {
                j--;
            }
        }
        return largest;
    }
}
