package practics09;

class Animal {
	protected  String name;
	protected  int       age;
	
	public void showProfile() {
		System.out.println("私の名前は" + name + "です");
		System.out.println(age + "才です");
	}

	public void speak() {
		System.out.println("......");
	}

}
