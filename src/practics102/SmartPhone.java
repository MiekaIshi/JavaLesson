package practics102;

public class SmartPhone  extends Computer{
	public SmartPhone () {
		super("スマートフォン");
	}

	public void input() {
		System.out.println("タッチパネルディスプレイをタップして操作");
	}

	public void output() {
		System.out.println("タッチパネルディスプレイに出力");
	}

	public void couumnication() {
		System.out.println("インターネットと電話回線でで通信");
	}



}
