//ケース1
package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("テストの点数を入力：");
		int test = Integer.parseInt(br.readLine());

		if (0 > test || test > 100) {
			System.out.println("エラーです");
		} else if (test >= 60) {
			System.out.print("合格");
		} else if (60 > test) {
			System.out.print("不合格");
		}
	}

}
