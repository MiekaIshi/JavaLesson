package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("中間試験の点数を入力：");
		int midtermExam = Integer.parseInt(br.readLine());

		System.out.print("期末試験の点数を入力：");
		int finalExam = Integer.parseInt(br.readLine());

		if (midtermExam >= 60 && finalExam >= 60) {
			System.out.println("合格です");
		} else if (midtermExam + finalExam >= 130) {
			System.out.println("合格です");
		} else if (midtermExam + finalExam >= 100 && (midtermExam >= 90 || finalExam >= 90)) {
			System.out.println("合格です");
		} else {
			System.out.println("不合格です");
		}
	}
}
