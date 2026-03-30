// In two d arrays we access with [row yaxis] [column x axis]
class Solution {
    public boolean isValidSudoku(char[][] board) {
      char emptyFlag = '.';
    // Create three HashMaps of sets:
      // rows
      Map<Integer, Set<Character>> rows = new HashMap<>();
      // cols
      Map<Integer, Set<Character>> cols = new HashMap<>();
      // Squares keyed (r//3, c//3)
      Map<String, Set<Character>> squares = new HashMap<>();
    // Loop through every cell in board
      for(int row = 0; row < board.length; row++) {
        for(int column = 0; column < board[row].length; column++) {
          Character square = board[row][column];
          // Skip cells containing "."
          if(square != emptyFlag) {
            // let val = digit in cell
            // if val exists in rows[r] -> dupe
            String squareKey = (row / 3) + "," + (column / 3);

            // computeIfAbsent(Key, function):
            // function executes if value is absent
            // In our case we create a new empty hashset
            // We check if it contains square (being new it will def not)
            // This lets us more easily add square later after these if checks
            if (rows.computeIfAbsent(row, k -> new HashSet<>()).contains(square)
                || cols.computeIfAbsent(column, k -> new HashSet<>()).contains(square)
                || squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(square)
            ){
              return false;
            } 
            rows.get(row).add(square);
            cols.get(column).add(square);
            squares.get(squareKey).add(square); 
          }

        }

      }
      return true;
    }
}
