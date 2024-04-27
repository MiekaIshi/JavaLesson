package practics08;

public class Ex01 {

	public static void main(String[] args) {
		Dog dog = new Dog("ドーベルマン"); 
		dog.setName ("kuro");
		dog.setAge    (1);
		dog.showProfile();
		
		Dog dog2 = new Dog("チワワ");
		dog2.setName ("siro");
		dog2.setAge    (2);
		dog2.showProfile();
		
		Dog dog3 = new Dog("秋田");
		dog3.setName ("Jone");
		dog3.setAge    (1);
		dog3.showProfile();
		
		

	}

}
