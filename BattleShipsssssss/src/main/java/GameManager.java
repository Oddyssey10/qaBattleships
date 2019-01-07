import java.util.ArrayList;

public class GameManager {
	private static final String alphabet = "abcdefg";
	private static int axisSize = 10;
	private static int[][] board = new int[axisSize][axisSize];
	private int shipCount = 0;

	public ArrayList<String> placeShip(int shipLength) {

		ArrayList<String> alphaCells = new ArrayList<String>();
		String temp = null;
		int[] coordinates = new int[shipLength];
		int attempts = 0;
		boolean success = false;
		int location = 0;

		shipCount++;
		int incr = 1;

		if ((shipCount % 2) == 1) {
			incr = boardLength;
		}

		while (!success && attempts++ < 200) {
			location = (int) (Math.random() * axisSize);
			int x = 0;
			success = true;

			while (success && x < shipLength) {
				if (axisSize[location] == 0) {
					coordinates[x++] = location;
					location += incr;
					if (location >= axisSize) {
						success = false;
					}
					if (x > 0 && (location % axisSize == 0)) {
						success = false;
					} else {
						success = false;
					}
				}
			}
			int x = 0;
			int row = 0;
			int column = 0;

			while (x < shipLength) {
				board[coordinates[x]] = 1;
				row = (int) (coordinates[x] / axisSize);
				column = coordinates[x] % axisSize;
				temp = String.valueOf(alphabet.charAt(column));
				alphaCells.add(temp.concat(Integer.toString(row)));
				x++;
			}
		}
		return alphaCells;
	}
}
