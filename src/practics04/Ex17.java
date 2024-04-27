package practics04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
	
		for(int x = 0 ; x <size ; x++) {
			for(int y = 0 ; y< size ; y++) {
				System.out.print("$");
		}
			System.out.println(" ");
		}
	}

}
