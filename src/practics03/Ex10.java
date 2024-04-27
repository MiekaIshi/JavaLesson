package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("1～9の数字を入力：");
		int kazu = Integer.parseInt(br.readLine());

		if (0 > kazu || kazu > 9) {
			System.out.println("やり直してください");
		} else if ((kazu >= 1 && 3 >= kazu) || kazu >= 7) {
			System.out.println("当たり");
		} else if (kazu >= 4 && kazu <= 7) {
			System.out.println("はずれ");
		}

	}
}
