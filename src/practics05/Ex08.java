package practics05;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {

		int[][] array = new int[3][3];
		int max = 0;
		int min = 0 ;

		Random random = new Random();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int num = random.nextInt(10);
				//最初に入力された値で初期化する
				if(i == 0) {
				max = num ;
				min = num;	
				}
				array[i][j] = num;
				
				//最小値と最大値を比較
				if(min > num) {
					min = num ;
				}
				if(max < num) {
					max = num;
				}
			}
		}

		//二次元配列に値を出力
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(array[x][y] + " ");
			}
			System.out.println("");
		}
		System.out.println("最大値"+ max);
		System.out.println("最小値"+ min);
	}

}
