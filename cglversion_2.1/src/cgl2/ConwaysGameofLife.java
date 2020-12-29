package cgl2;
/**
 * Main class for checking the entire coverage and functionality of the code.
 */

/**
 * @author Sri Charan 2020501031
 *
 */
public class ConwaysGameofLife {

	/**
	 * This method checks whether to start the execution or not. After starting it
	 * calls the required functions based on the conditions given.
	 * @param string to start the game.
	 * @param n the size of the board.
	 * @param 2d array liveCells should be marked on the board as true.
	 * @param generation which need to be taken out.
	 * Output will be given from printboard.
	 * 
	 */

	public String Start(String inp, int n, int[][] livecells, String gen) {
		String[] tokens = gen.split(" ");
		boolean flag;
//		condition to start the execution on not.
		if (inp.equals("start")) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			Board b = new Board();
//			for printing current generation.
			if (tokens[0].equals("current")) {
				return b.printBoard(b.createBoard(n, livecells));
			} 
//			for printing next generation.
			else if (tokens[0].equals("next")) {
				return b.printBoard(b.generateNextGeneration(b.createBoard(n, livecells)));
			} 
//			for printing nth generation.
			else if (tokens[0].equals("gen")) {
				int nthgen = Integer.parseInt(tokens[1]);
				boolean[][] gener = null;
				boolean[][] curgener = null;
				for (int i = 0; i < nthgen; i++) {
					if (i == 0) {
						curgener = b.createBoard(n, livecells);
					} else {
						gener = b.generateNextGeneration(curgener);
//						condition to check whether current and next generations are same or not.
						if (b.printBoard(curgener).equals(b.printBoard(gener))) {
							break;
						}
						curgener = gener;
					}
				}
				return b.printBoard(curgener);
			} 
//			for printing infinite generation.
			else if (tokens[0].equals("infinite")) {
				boolean[][] gener = new boolean[10][10];
				boolean[][] curgener = null;
				for (int i = 0;; i++) {
					if (i == 0) {
						curgener = b.createBoard(n, livecells);
					} else {
//						System.out.println(i);
						gener = b.generateNextGeneration(curgener);
//						condition to check whether current and next generations are same or not.
						if (b.printBoard(curgener).equals(b.printBoard(gener))) {
							break;
						}
						curgener = gener;
					}
				}
				return b.printBoard(curgener);
			}
		}
		return "";
	}

}
