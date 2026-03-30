class Solution {
    public boolean isValidSudoku(char[][] board) {
      char emptyFlag = '.';
      int squareSize = 3;
      // Map for quick lookup, set for items in that value
        // For row x have we seen item y
        Map<Integer, Set<Character>> rows = new HashMap<>();
        // For column x have we seen item y
        Map<Integer, Set<Character>> columns = new HashMap<>();
        // for square x have we seen item y
        Map<String, Set<Character>> squares = new HashMap<>();

        // Loop through every square
        for(int row = 0; row < board.length; row++){
          for(int column = 0; column < board[row].length; column++) {
            // Need to define a square key
            String squareKey = (row / squareSize) + "," + (column / squareSize);
            
            char square = board[row][column];
            if(square != emptyFlag){
              // Square exists in rows, columns or squares for this row, column or square
              // computeIfAbsent(): checks value for key, if it doesnt exist, do function
              // In our case if value does not exist we create an empty hash set
              // Our if statment checks if square is a value for given key, if key doesnt exist
              // it will make an empty hashmap that also does not contain the key so statement will be false
              // and we are still valid. If value exists for key howver, we will short circuit and return false
              if(rows.computeIfAbsent(row, k -> new HashSet<>()).contains(square) ||
              columns.computeIfAbsent(column, k -> new HashSet<>()).contains(square) ||
              squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(square)){
                return false;
              }
              // Add square to sets in maps
              rows.get(row).add(square);
              columns.get(column).add(square);
              squares.get(squareKey).add(square);
            }
          }
        }
        return true;
    }
}
