package practics05;

public class Ex07 {

	public static void main(String[] args) {
		
		int [] [] array = new int[3][3];
		int nine = 1;
		
		//二次元配列に値をセット
		for(int x = 0 ; x< 3 ; x++) {
			for(int y = 0 ; y < 3 ; y++) {
				array[x][y] = nine;
				nine++;
			}
		}
		
		//二次元配列に値を出力
		for(int x = 0 ; x< 3 ; x++) {
			for(int y = 0 ; y < 3 ; y++) {
				System.out.print(array[x][y] +" ");
			}
			System.out.println("");
		}

	}

}
