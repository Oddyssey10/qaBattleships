import java.util.ArrayList;

public class Ship {

	private String name;

	ArrayList<String> shipLocations = new ArrayList<String>();

	public Ship(String name) {
		this.setName(name);
	}

	public String checkTheGuess(String userGuess) {
		String result = "Miss"; // the result is initialized as the default "Miss" meaning nothing has been hit.
		int index = shipLocations.indexOf(userGuess);

		if (index >= 0) {
			shipLocations.remove(index);

			if (shipLocations.isEmpty()) {
				result = "Ship Sunk"; // all the positions of the ship has been hit and so the ship is sunk
			} else {
				result = "Ship Hit";
			}
		}
		return result;
	}

	public void setShipLocations(ArrayList<String> shipLocations) {
		this.shipLocations = shipLocations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
