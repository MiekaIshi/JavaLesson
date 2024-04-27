package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("数字を入力：");
			int kazu = Integer.parseInt(br.readLine());
			sum += kazu;
		}
		System.out.println(sum / 10);

	}

}
