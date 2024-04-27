package practics09;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("ポチ", 3);
		dog.showProfile();
		dog.run();
		dog.speak();

		Cat cat = new Cat("ミケ", 2);
		cat.showProfile();
		cat.sleep();
		cat.speak();
		System.out.println("");

		Animal array[] = new Animal[4];
		array[0] = new Dog("ジョン", 3);
		array[1] = new Cat("ミケ", 2);
		array[2] = new Dog("パトラッシュ", 1);
		array[3] = new Cat("ミー", 1);

		for (int i = 0; i < 4; i++) {
			array[i].speak();
		}
	}

}
