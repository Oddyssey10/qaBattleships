
public class BoardManager {
	private final static int x_AXIS = 10;
	private final static int y_AXIS = 10;

	private static int[][] board = new int[x_AXIS][y_AXIS];

	public BoardManager(BoardManager cpuBoard) {
		// TODO Auto-generated constructor stub
	}


	public void drawBoard() {
		for (int i = 0; i < x_AXIS; i++) {
			for (int j = 0; j < y_AXIS; j++) {
				board[i][j] = 0;
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}


	public static int[][] getBoard() {
		return board;
	}

	public static int getxAxis() {
		return x_AXIS;
	}

	public static int getyAxis() {
		return y_AXIS;
	}
}
