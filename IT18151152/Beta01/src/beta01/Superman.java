package beta01;

import java.util.ArrayList;

public class Superman extends SuperHero{

	private String Weakness;

	public Superman(String name, String mainSuperPower, ArrayList<String> otherPowers, String weakness) {
		super("Superman", mainSuperPower, otherPowers);
		Weakness = weakness;
	}
	
	
	
}
