package cgl2;
/**
 * Board class to create board, next generation and print board
 */

/**
 * @author Sri Charan 2020501031
 *
 */
public class Board {
	/**
	 * This method creates a board for the CGL.
	 * 
	 * @param n the size of the board.
	 * @param 2d array liveCells should be marked on the board as true.
	 * return type of this class is 2d boolean array.
	 * output is cglboard with boolean 2d array.
	 * 
	 */
	public boolean[][] createBoard(final int m, final int n, int[][] liveCells) {
		// You can call the printBoard that prints the board.
		boolean cglBoard[][] = new boolean[m][n];
		for (int i = 0; i < liveCells.length; i++) {
			Element e = new Element();
			cglBoard = e.makeTrue(cglBoard, liveCells[i][0], liveCells[i][1]);
		}
		return cglBoard;
	}

	/**
	 * This method prints the CGL board.
	 * 
	 * @param board of 2d boolean array.
	 * Output as a string consisting of * & . 
	 */
	public String printBoard(boolean board[][]) {
		// your code goes here...
		String str = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j]) {
					str += "*";
					if (j < board.length - 1) {
						str += " ";
					}
				} else {
					str += ".";
					if (j < board.length - 1) {
						str += " ";
					}
				}
			}
			if (i < board.length - 1) {
				str += "\n";
			}
		}
		return str;
	}

	/**
	 * This method prints the nextgeneration CGL board.
	 * 
	 * @param current generation board of 2d boolean array.
	 * return type of this class is 2d boolean array.
	 * output is nextgenboard with boolean 2d array.
	 * 
	 */

	public boolean[][] generateNextGeneration(boolean[][] board) {
//    	boolean board[][] = new boolean[n][n];
//    	String[] lines = current.split("\n");
//    	for(int i = 0; i < lines.length; i++) {
//    		String[] characters = lines[i].split(" ");
//    		for(int j = 0; j < characters.length; j++) {
//    			if(characters[j].equals("*")) {
//    				board[i][j] = true;
//    			}
//    			else {
//    				board[i][j] = false;
//    			}
//    		}
//    	}
//    	
//    	create a dummy next generation board.
		boolean nextGenBoard[][] = new boolean[board.length][board[0].length];
		for (int l = 0; l < board.length; l++) {
			for (int m = 0; m < board[l].length; m++) {
				nextGenBoard[l][m] = board[l][m];
			}
		}
//        Iterate through the loop to find the next generation.
		for (int i = 0; i < board.length; i++) {
			// int count1 = 0;
			for (int j = 0; j < board[i].length; j++) {
				int count = 0;
				int a = i - 1;
				int b = j - 1;
				if (a < 0) {
					a = board.length - 1;// for boundary conditions
				}
				if (b < 0) {
					b = board.length - 1;
				}
//				checking the live cells around the given cell.
				if (board[a][b]) {
					count += 1;
				}
				if (board[a][j]) {
					count += 1;
				}
				if (board[a][(j + 1) % board.length]) {
					count += 1;
				}
				if (board[i][b]) {
					count += 1;
				}
				if (board[i][(j + 1) % board.length]) {
					count += 1;
				}
				if (board[(i + 1) % board.length][b]) {
					count += 1;
				}
				if (board[(i + 1) % board.length][j]) {
					count += 1;
				}
				if (board[(i + 1) % board.length][(j + 1) % board.length]) {
					count += 1;
				}
				if (board[i][j]) {
					if (count == 2 || count == 3) {
						nextGenBoard[i][j] = true;
					} else {
						nextGenBoard[i][j] = false;
					}
				} else {
					if (count == 3) {
						nextGenBoard[i][j] = true;
					} else {
						nextGenBoard[i][j] = false;
					}
				}
			}
		}
//        System.out.println("NextGenration");
		return nextGenBoard;
	}
}
