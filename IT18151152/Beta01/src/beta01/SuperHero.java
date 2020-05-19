package beta01;

import java.util.ArrayList;

public abstract class SuperHero implements IShow{
	protected String name ;
	protected String mainSuperPower;
	protected ArrayList<String> otherPowers = new ArrayList<>();
	
	@Override
	public void showKey(){
		System.out.println("Name: " +name + " Main superpower: " +mainSuperPower);
	}
	
	@Override
	public void list(){
		for(String x: otherPowers){
			System.out.println("Other powers: " +x);
		}
		
	}

	public SuperHero(String name, String mainSuperPower, ArrayList<String> otherPowers) {
		super();
		this.name = name;
		this.mainSuperPower = mainSuperPower;
		this.otherPowers = otherPowers;
	}

}
