package practics05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		int num = -1;

		while (true)) {
			num = Integer.parseInt(br.readLine());

			if (num == 0) {
				break;
			} else if ((num % 2) == 0) {
				even.add(num);
			} else {
				odd.add(num);
			}
		}

		System.out.print("偶数：");
		System.out.println(even);
		System.out.print("奇数：");
		System.out.println(odd);
		//for(int i : odd) {
		//System.out.print(odd.get(i));}
		//}

	}

}
