package practics05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ex10a {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new ArrayList<>());
		}

		// 入力された値を格納
		while (true) {
			int num = Integer.parseInt(br.readLine());

			if (num == 0) {
				break;
			}

			list.get(num % 10).add(num);

		}

		System.out.println();

		// 格納された値を表示する処理

		int n = 0; // 表示する一の位の値

		for (ArrayList<Integer> array : list) {
			System.out.print("1の位が" + n++ + ":");

			// 取り出したArrayListに要素がなければ該当数値無し
			if (array.size() == 0) {
				System.out.println("なし");
				// ループを継続(一の位の次の数字の処理へ)
				continue;
			}

			// (小さい順に表示したいため)取り出したArrayListをソート
			Collections.sort(array);

			// 該当数値を順に表示
			for (int value : array) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

}