package practics102;

public abstract class Computer {
	protected String type ;

	public Computer(String type) {
		this.type = type ;
	}
	
	public void showType() {
		System.out.println("コンピューターの種類："+ type );
	}
	
	public void input() {
		
	}
	
	public void output() {
		
	}
	
	public void couumnication(){
		System.out.println("インターネットで通信");
	}

}
