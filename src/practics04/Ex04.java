package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int win = 0;
			//int lose = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("0か1の数字を入力：");
			int kazu = Integer.parseInt(br.readLine());
			if (kazu == 1) {
				win++;
			}
		}
		System.out.println(win + "勝" + (10 - win)  + "敗");
	}

}
