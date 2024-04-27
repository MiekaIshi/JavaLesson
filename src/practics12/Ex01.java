package practics12;

public class Ex01 {

	public static void main(String[] args) {
		//int a[] = [ 0. 1. 2];
		Integer[] a = { 0, 1, 2 };

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println("a [" + i + "] = " + a[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("配列の範囲を超えています");
			}
		}

	}

}
