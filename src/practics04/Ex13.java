package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("自然数を入力");
		int kazu = Integer.parseInt(br.readLine());

		int i;
		for (i = 2; i <= kazu; i++) {
			if (kazu % i == 0) {
				kazu /= i;
				;
				System.out.print(i + " ");
				//	System.out.println("kazu="+ kazu);
				i = 1;
			}
			//	System.out.println(("i="+ i));
		}

	}

}
