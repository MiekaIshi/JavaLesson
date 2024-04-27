package practics11;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		CellPhone cellPhone = new CellPhone();

		funcPhone(cellPhone);
		funcMailer(cellPhone);
		funcComputer(cellPhone);
	}

	public static void funcPhone(CellPhone cellPhone) {
		cellPhone.callPhone();
		cellPhone.receivePhone();
	}

	public static void funcMailer(CellPhone cellPhone) {
		cellPhone.sendMail();
		cellPhone.receiveMail();
	}

	public static void funcComputer(CellPhone cellPhone) {
		cellPhone.playGame();
		cellPhone.browseWeb();
	}

}
