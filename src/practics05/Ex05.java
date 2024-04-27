package practics05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num[] = new int[10];

		for (int i : num) {
		i = Integer.parseInt(br.readLine());
		System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10 ; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				for (int a : num) {
					System.out.print(a + " ");
			}
				//System.out.println(i + 1 +"回目 ");
			}
			}
		for (int k : num) {
			System.out.print(k + " ");
		}
	}

}
