package practics05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> array = new ArrayList<Integer>();

		//数値入力
		while (true) {
			int num = Integer.parseInt(br.readLine());

			if (num == 0) {
				break;
			}
			array.add(num);
		}
		//2を削除
		Iterator<Integer> iterator = array.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (num == 2) {
				// 0 は削除
				iterator.remove();
			}
		}
		System.out.println(array);
	}

}