package practics102;

public class PersonalComputer extends Computer {

	public PersonalComputer() {
		super("パーソナルコンピュータ");
	}

	public void input() {
		System.out.println("キーボード、マウスで入力");
	}

	public void output() {
		System.out.println("ディスプレイに出力");
	}

	public void couumnication() {
		System.out.println("インターネットで通信");
	}

}
