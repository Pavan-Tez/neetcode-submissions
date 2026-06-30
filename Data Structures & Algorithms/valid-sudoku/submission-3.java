class Solution {
     public boolean isValidSudoku(char[][] board) {

	        HashMap<Integer, Set<Character>> rowsMap = new HashMap<>();
	        HashMap<Integer, Set<Character>> columnMap = new HashMap<>();
	        HashMap<Integer, Set<Character>> boxMap = new HashMap<>();

	        for (int row = 0; row < 9; row++) {
	            for (int column = 0; column < 9; column++) {

	                char value = board[row][column];

	                if (value == '.') continue;

	                rowsMap.putIfAbsent(row, new HashSet<>());
	                columnMap.putIfAbsent(column, new HashSet<>());

	                int boxIndex = (row / 3) * 3 + (column / 3);
	                boxMap.putIfAbsent(boxIndex, new HashSet<>());

//	                if (rowsMap.get(row).contains(value) ||
//	                    columnMap.get(column).contains(value) ||
//	                    boxMap.get(boxIndex).contains(value)) {
//	                    return false;
//	                }

	                if(!rowsMap.get(row).add(value) || 
	                	!columnMap.get(column).add(value) ||
	                	!boxMap.get(boxIndex).add(value)) {
	                	return false;
	                }
	            }
	        }
	        return true;
	    }
}
