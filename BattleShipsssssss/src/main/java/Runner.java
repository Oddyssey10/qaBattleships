
public class Runner {
	public static void main(String[] args) {
		Game game = new Game();
		game.setUp();
		game.playing();

		BoardManager playerBoard = new BoardManager(playerBoard);
		playerBoard.drawBoard();
	}
}
