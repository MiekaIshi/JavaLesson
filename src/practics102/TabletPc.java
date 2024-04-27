package practics102;

public class TabletPc  extends Computer{
	public TabletPc() {
		super("タブレットPC");
	}

	public void input() {
		System.out.println("タッチパネルディスプレイをタップして操作");
	}

	public void output() {
		System.out.println("タッチパネルディスプレイに出力");
	}

	public void couumnication() {
		System.out.println("インターネットで通信");
	}


}
