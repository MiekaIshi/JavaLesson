package practics05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num[] = new int[10];
		int even[] = new int[10];
		int odd[] = new int[10];
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		for (int i : num) {
			if (i % 2 == 0) {
				even[evenCount] = i;
				evenCount++;
			} else {
				odd[oddCount] = i;
				oddCount++;
			}
		}
		//偶数を表示
		System.out.print("偶数：");
		for (int i = 0; i < evenCount; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println(" ");

		//偶数を表示
		System.out.print("奇数：");
		for (int i = 0; i < oddCount; i++) {
			System.out.print(odd[i] + " ");
		}
		System.out.println(" ");
	}

}
