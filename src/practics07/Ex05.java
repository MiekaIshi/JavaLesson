package practics07;

public class Ex05 {

	public static void main(String[] args) {
		
		triangle(7 , '#' );
		triangle(5 , '%' );
		triangle(3 , '●' );;

	}

	public static void triangle(int size , char letter) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(letter);
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
