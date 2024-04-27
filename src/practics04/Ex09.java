package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("個数をを入力：");
		int kazu = Integer.parseInt(br.readLine());
		int print = 0;

		for (int i = 0; i < kazu; i++) {
			System.out.print(print +" ");
			print++;

			if (10 ==  print) {
				print = 0;
			}

		}
	}
}