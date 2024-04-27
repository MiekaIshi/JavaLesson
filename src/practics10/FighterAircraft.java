package practics10;

public class FighterAircraft extends AirPlane {
	public FighterAircraft () {
		super("戦闘機");
	}

	public void fly() {
		System.out.println("攻撃に出るために飛行します");
	}
	public void carryPassengers() {
		System.out.println("戦闘します");
	}


}
