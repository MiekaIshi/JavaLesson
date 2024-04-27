package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int giants = 0;
		int tigers = 0;

		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "回表、巨人の得点は？");
			int giant = Integer.parseInt(br.readLine());
			giants += giant;

			System.out.print(i + "回裏、阪神の得点は？");
			int tiger = Integer.parseInt(br.readLine());
			tigers += tiger;
		}
		System.out.println("巨人：" + giants + "点、阪神：" + tigers + "点");
		if (giants > tigers) {
			System.out.println("巨人の勝ち");
		} else if (tigers > giants) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}

}
