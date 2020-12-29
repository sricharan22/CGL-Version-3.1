package cgl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test cases to check the whole game.
 */

/**
 * @author Sri Charan 2020501031
 *
 */
public class TestJunitGame {
	@Test
	public void testStartOne() {
		String str = "start";
		int n = 5;
		int[][] livecells = { { 1, 1 }, { 2, 3 }, { 3, 3 } };
		String gen = "current";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.Start(str, n, livecells, gen);
		String testing = ". . . . .\n. * . . .\n. . . * .\n. . . * .\n. . . . .";
		Assertions.assertEquals(testing, newPrint);
	}

	@Test
	public void testStartTwo() {
		String str = "end";
		int n = 5;
		int[][] livecells = { { 1, 1 }, { 2, 3 }, { 3, 3 } };
		String gen = "current";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.Start(str, n, livecells, gen);
		String testing = "";
		Assertions.assertEquals(testing, newPrint);
	}

	@Test
	public void testStartThree() {
		String str = "start";
		int n = 5;
		int[][] livecells = { { 1, 1 }, { 1, 3 }, { 2, 2 }, { 2, 3 }, { 3, 1 }, { 3, 3 } };
		String gen = "next";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.Start(str, n, livecells, gen);
		String testing = ". . . . .\n" + ". . . * .\n" + ". * . * *\n" + ". . . * .\n" + ". . . . .";
		Assertions.assertEquals(testing, newPrint);
	}

	@Test
	public void testStartFour() {
		String str = "start";
		int n = 5;
		int[][] livecells = { { 1, 1 }, { 1, 3 }, { 2, 2 }, { 2, 3 }, { 3, 1 }, { 3, 3 } };
		String gen = "gen 4";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.Start(str, n, livecells, gen);
		String testing = ". . . * .\n" + ". . * . *\n" + "* . . . .\n" + ". . * . *\n" + ". . . * .";
		Assertions.assertEquals(testing, newPrint);
	}

	@Test
	public void testStartFive() {
		String str = "start";
		int n = 10;
		int[][] livecells = { { 1, 3 }, { 1, 4 }, { 2, 4 }, { 5, 3 }, { 5, 4 }, { 6, 2 }, { 6, 3 }, { 7, 5 },
				{ 8, 4 } };
		String gen = "infinite";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.Start(str, n, livecells, gen);
		String testing = ". . . . . . . . . .\n" + ". . . . . . . . . .\n" + ". . . . . . . . . .\n"
				+ ". . . . . . . . . .\n" + ". . . . . . . . . .\n" + ". . . . . . . . . .\n" + ". * * . . . . . . .\n"
				+ ". * * . . . . . . .\n" + ". . . . . . . . . .\n" + ". . . . . . . . . .";
		Assertions.assertEquals(testing, newPrint);
	}

	@Test
	public void testStartSix() {
		String str = "start";
		int n = 10;
		int[][] livecells = { { 1, 3 }, { 1, 4 }, { 2, 4 }, { 5, 3 }, { 5, 4 }, { 6, 2 }, { 6, 3 }, { 7, 5 },
				{ 8, 4 } };
		String gen = "gen 25";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.Start(str, n, livecells, gen);
		String testing = ". . . . . . . . . .\n" + ". . . . . . . . . .\n" + ". . . . . . . . . .\n"
				+ ". . . . . . . . . .\n" + ". . . . . . . . . .\n" + ". . . . . . . . . .\n" + ". * * . . . . . . .\n"
				+ ". * * . . . . . . .\n" + ". . . . . . . . . .\n" + ". . . . . . . . . .";
		Assertions.assertEquals(testing, newPrint);
	}
}
