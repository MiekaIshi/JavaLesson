package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("個数をを入力：");
		int kazu = Integer.parseInt(br.readLine());

		for (int i = 1; i <= kazu; i++) {
			System.out.print("*");
		}
	}
}