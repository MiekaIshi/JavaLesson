package practics11;

public class Mailer implements IMailer{
	public void sendMail(){
		System.out.println("メールを送信する");
	}
	
	public void receiveMail(){
		System.out.println("メールを受信する");
	}

}
