package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		while (sum < 100) {
			System.out.println("数値を入力");
			int kazu = Integer.parseInt(br.readLine());
			sum += kazu;
		}

		System.out.println("合計は " + sum);
	}
}
