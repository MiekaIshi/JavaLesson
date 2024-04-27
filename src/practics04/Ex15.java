package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex15 {


		public static void main(String[] args) throws IOException {	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int kazu = -100;

		while (kazu != 0) {
			kazu = Integer.parseInt(br.readLine());
			sum += kazu;
		}
		System.out.println("合計は" + sum);
	}

}
