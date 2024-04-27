package practics09;

public class Dog extends Animal{
	public Dog(String name , int age) {
	this.name = name ;
	this.age     = age ;
	}
	public void run() {
		System.out.println("トコトコ");
	}
	public void speak() {
		System.out.println("ワンワン");
	}

}
