package practics07;

public class Ex06 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			kuku(i);
		}
	}

	public static void kuku(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.print(dan * i + " ");
		}
		System.out.println("");
	}

}
