package practics11;

public class CellPhone implements IComputer , IPhone , IMailer{

	public void callPhone() {
		System.out.println("電話をかける");
	}
		
	 public void receivePhone() {
		System.out.println("電話を受け取る");	
	}
	
	public void sendMail(){
		System.out.println("メールを送信する");
	}
	
	public void receiveMail(){
		System.out.println("メールを受信する");
	}
	

public void playGame(){
	System.out.println("3Dゲームをする");
	}
	
	public void browseWeb() {
		System.out.println("ウェブを閲覧する");
	}

}
