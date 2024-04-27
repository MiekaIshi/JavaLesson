package practics07;

public class Ex04 {

	public static void main(String[] args) {
		
		//三角形を3つ表示
		triangle(3);
		triangle(4);
		triangle(5);

	}

	public static void triangle(int size) {
		for(int i = 0 ; i < size ; i++) {
			for(int j = 0  ; j  <= i ; j++) {
				System.out.print("$");
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
