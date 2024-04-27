package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int kazu = -100;
		int count = 0;

		while (kazu != 0) {
			kazu = Integer.parseInt(br.readLine());
			sum += kazu;
			count++;
		}
		System.out.println("平均値は" + sum / (count - 1 ));
	//System.out.println(count);
	}

}
