package cgl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test cases to check printBoard method.
 */

/**
 * @author Sri Charan 2020501031
 *
 */
public class TestJunitPrintBoard {
	@Test
	public void testCreateBoard() {
		boolean[][] current = { { false, false, false, false, false }, { false, true, false, false, false },
				{ false, false, false, true, false }, { false, false, false, true, false },
				{ false, false, false, false, false } };
		Board board = new Board();
		String res = board.printBoard(current);
		String testing = ". . . . .\n" + ". * . . .\n" + ". . . * .\n" + ". . . * .\n" + ". . . . .";
		Assertions.assertEquals(testing, res);
	}
}
