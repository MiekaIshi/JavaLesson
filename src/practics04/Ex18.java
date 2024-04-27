package practics04;

public class Ex18 {

	public static void main(String[] args) {

		int x = 0;
		int y = 1;
		int z = 0;

		System.out.print(x + "," + y + ".");

		while (z < 1000) {
			z = x + y;
			if(1000 < z ) {
				return;
			}
			System.out.print(z + ",");
			x = y;
			y = z;
		}
	}
}
