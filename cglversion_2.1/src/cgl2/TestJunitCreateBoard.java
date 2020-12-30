package cgl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test cases to check createBoard method.
 */

/**
 * @author Sri Charan 2020501031
 *
 */
public class TestJunitCreateBoard {
	@Test
	public void testCreateBoard() {
		int m = 5;
		int n = 5;
		int[][] livecells = { { 1, 1 }, { 2, 3 }, { 3, 3 } };
		Board board = new Board();
		boolean[][] board2 = board.createBoard(m, n, livecells);
		String res = "";
		for (int i = 0; i < board2.length; i++) {
			for (int j = 0; j < board2.length; j++) {
				res += board2[i][j];
				if (j < board2.length - 1) {
					res += " ";
				}
			}
			if (i < board2.length - 1) {
				res += "\n";
			}
		}
		String testing = "false false false false false\n" + "false true false false false\n"
				+ "false false false true false\n" + "false false false true false\n" + "false false false false false";
		Assertions.assertEquals(testing, res);
	}
}
