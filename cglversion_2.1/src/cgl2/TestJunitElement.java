package cgl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test cases to check Element class.
 */

/**
 * @author Sri Charan 2020501031
 *
 */
public class TestJunitElement {
	@Test
	public void testElement() {
		boolean[][] board = { { false, false, false }, { false, false, false }, { false, false, false } };
		Element board1 = new Element();
		boolean[][] board2 = board1.makeTrue(board, 1, 0);
//		System.out.println(board1);
		String res = "";
		for (int i = 0; i < board2.length; i++) {
			for (int j = 0; j < board2.length; j++) {
				res += board2[i][j];
			}
		}
		Assertions.assertEquals("falsefalsefalsetruefalsefalsefalsefalsefalse", res);
	}
}
