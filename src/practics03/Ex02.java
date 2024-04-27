package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("数値xを入力");		
		int x = Integer.parseInt(br.readLine());
		System.out.print("数値yを入力");
		int y = Integer.parseInt(br.readLine());
		
		if(x == y) {
			System.out.print("xはyと等しい");
		}

	}

}

	