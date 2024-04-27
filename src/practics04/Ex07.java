package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int max = 0;
			int min = 0;

			for (int i = 0; i < 10; i++) {
				System.out.println("整数を入力：");
				int kazu = Integer.parseInt(br.readLine());

				if (i == 0) {
					max = kazu;
					min = kazu;
				} else {
					if (max < kazu) {
						max = kazu;
					} else if (kazu < min) {
						min = kazu;
					}
				}
			}
			System.out.println("最大値" + max + "最小値" + min);
		}

	}
}
