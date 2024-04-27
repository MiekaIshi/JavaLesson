package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int max = 0;
			for (int i = 0; i < 10; i++) {
				System.out.println("自然数を入力：");
				int kazu = Integer.parseInt(br.readLine());

				if (max < kazu) {
					max = kazu;
				}
			}
			System.out.println("最大値は" + max);
		}
	}
}
