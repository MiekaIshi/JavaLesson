package practics04;

public class Ex14 {

	public static void main(String[] args) {

		System.out.println("【九九の表の出力例】");
		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				System.out.print(x * y + "  ");
			}
			System.out.println("\n");
		}

		System.out.println("設問2");
		for (int x2 = 1; x2 <= 9; x2++) {
			if (x2 == 3) {
				for (int i = 1; i <= 9; i++) {
					System.out.print(i + "  ");
				}
			} else {
				for (int y2 = 1; y2 <= 9; y2++) {
					System.out.print(x2 * y2 + "  ");
				}
			}
			System.out.println("\n");
		}

		
	}
}
