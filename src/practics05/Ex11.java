package practics05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> array = new ArrayList<String>();

		while (true) {
			String word = br.readLine();

			if ("".equals(word)) {
				break;
			}
			array.add(word);
			//System.out.println(array);
		}
		System.out.println(array);
	}

}
