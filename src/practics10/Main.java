package practics10;

public class Main {

	public static void main(String[] args) {
		FighterAircraft  fighter = new FighterAircraft();
		PassengerPlant airliner= new PassengerPlant();
		
		System.out.println(fighter.getType());
		fighter.fly();
		fighter.carryPassengers() ;
		
		System.out.println(airliner.getType());
		airliner.fly();
		airliner.carryPassengers() ;
	}

}
