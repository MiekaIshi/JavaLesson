package practics09;

public class Cat extends Animal{
	public Cat(String name , int age) {
	this.name = name ;
	this.age     = age ;
	}
	
	public void sleep() {
		System.out.println("スースー");
	}
   public void speak() {
	   System.out.println("ニャー");
   }

}
