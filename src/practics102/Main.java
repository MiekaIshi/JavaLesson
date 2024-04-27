package practics102;

public class Main {

	public static void main(String[] args) {
		Computer[] op = new Computer[3];
		op[0] = new PersonalComputer();
		op[1] = new  TabletPc();
		op[2] = new SmartPhone();

		for(Computer c : op) {
			c.showType();
			c.input();
			c.output();
			c.couumnication();
			System.out.println("--------------------");
		}
	}

}
