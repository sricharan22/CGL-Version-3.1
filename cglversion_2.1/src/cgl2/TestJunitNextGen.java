package cgl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test cases to check NextGeneration method.
 */

/**
 * @author Sri Charan 2020501031
 *
 */
public class TestJunitNextGen {
	@Test
	public void testCreateBoard() {
		boolean[][] current = { { false, false, false, false, false }, { false, true, false, false, false },
				{ false, false, false, true, false }, { false, false, false, true, false },
				{ false, false, false, false, false } };
		Board board = new Board();
		boolean[][] board2 = board.generateNextGeneration(current);
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
		String testing = "false false false false false\n" + "false false false false false\n"
				+ "false false true false false\n" + "false false false false false\n"
				+ "false false false false false";
		Assertions.assertEquals(testing, res);
	}
}
