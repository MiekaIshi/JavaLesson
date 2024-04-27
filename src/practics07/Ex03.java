package practics07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int num1 = 23;
		//int num2 = 77;
		//System.out.println(bigger(num1, num2) + "の方が大きい");
		
		System.out.println("数値を入力");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		int max = 0;
	
		if(max < bigger(x, y) ) {
			max = bigger(x, y);
		}
		
		if(max < bigger(y, z) ) {
			max = bigger(y, z);
		}
		
		System.out.println("最大値は"+ max);
		
	}

	public static int bigger(int a, int b) {
		if (a < b) {
			return b;
		} else {
			return a;
		}
	}

}
