package cgl2;
/**
 * Class to make the given position as true.
 */

/**
 * @author Sri Charan 2020501031
 *This class is implemented to make the given cell position as true.
 *@param boolean 2d array board.
 *@param int type of row position.
 *@param int type of col position.
 *output will be the 2d boolean array.
 *
 */
public class Element {
	public boolean[][] makeTrue(boolean[][] cglBoard, int row, int col) {
		cglBoard[row][col] = true;
		return cglBoard;
	}
}
