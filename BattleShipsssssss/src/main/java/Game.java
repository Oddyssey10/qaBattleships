import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private ArrayList<Ship> listOfShips = new ArrayList<Ship>();
	private Scanner userInput = new Scanner(System.in);
	// private GameManager gameManager = new GameManager();

	int numberOfGuesses = 0;
	
	public int[][] placeShip(int shipLength) {
		BoardManager.getBoard();
		BoardManager cpuBoard = new BoardManager(cpuBoard);
		
		BoardManager playerBoard = new BoardManager(playerBoard);
		playerBoard.drawBoard();
		
	//	for (int index : board[x_Axis])

	}

	public void setUp() {
		System.out.println("--- Welcome to BATTLESHIPS ---");
		System.out.println("--- You must Sink the computer SHIPS in order to WIN ---");
		System.out.println("--- Try to sink them in as few GUESSES as possible ---");

		Ship ship1 = new Ship("Patrol Boat"); // x2
		Ship ship2 = new Ship("Patrol Boat");
		Ship ship3 = new Ship("Battle Ship"); // x2
		Ship ship4 = new Ship("Battle Ship");
		Ship ship5 = new Ship("Submarine"); // x1
		Ship ship6 = new Ship("Destroyer");
		Ship ship7 = new Ship("Carrier");

		// adding the created ships to the listOfShip
		listOfShips.add(ship1);
		listOfShips.add(ship2);
		listOfShips.add(ship3);
		listOfShips.add(ship4);
		listOfShips.add(ship5);
		listOfShips.add(ship6);
		listOfShips.add(ship7);

		for (Ship ship : listOfShips) {
			location = placeShip(3);
			ship.setShipLocations(location);
		}
	}

	public void playing() {
		while (!listOfShips.isEmpty()) {
			String userGuess = getUserInput();
			checkPlayerGuess(userGuess);
		}
		endGame();
	}

	private void checkPlayerGuess(String userGuess) {
		numberOfGuesses++; // increase number of guess
		String result = "Miss";

		for (Ship ship : listOfShips) {
			result = ship.checkTheGuess(userGuess); // is the guess anywhere in which the ship is placed from the
													// checkTheGuess method in the Ship class
			if (result == "Ship Hit") {
				break;
			}
			if (result == "Ship Sunk") {
				listOfShips.remove(ship);
			}
		}
		System.out.println(result);
	}

	private void endGame() {
		System.out.println("All Ships have been sunk");
	}

	private String getUserInput() {
		String guess = userInput.nextLine();
		return guess;
	}

	public int getNumberOfGuesses() {
		return numberOfGuesses;
	}

	public void setNumberOfGuesses(int numberOfGuesses) {
		this.numberOfGuesses = numberOfGuesses;
	}

}
