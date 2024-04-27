package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("自然数を入力");
		int kazu = Integer.parseInt(br.readLine());

		for (int i = 2; i <= (kazu / 2); i++) {
			if ((kazu % i) == 0) {
				//System.out.println(i);
				System.out.println(kazu + "は素数ではない");
				return;
			}
			//System.out.println(i);
		}
		System.out.println(kazu + "は素数");
	}
}
