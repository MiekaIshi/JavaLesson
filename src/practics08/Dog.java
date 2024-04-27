package practics08;
public class Dog {
	private String name;
	private String  breed ;
	private int       age ;
	
	public Dog (String kind) {
		this.breed = kind ;
	}
	
	  public void setName(String name) {
		    this.name = name;
		  }
	  
	  public void setAge(int age) {
		    this.age = age;
		  }
	  
	  public void showName() {
		    System.out.println("名前は" + this.name +"です");
		    System.out.println("");
		  }
	  
	  public void showProfile() {
		  System.out.println("名前は"+ this.name +"です");
		  System.out.println("犬種は"+ this.breed +"です");
		  System.out.println("年齢は"+ this.age +"才です");
		  System.out.println("");
	  }

}
