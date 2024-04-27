package practics112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)  throws IOException {
		//Calculator calculator = new Sum();
		//Calculator calculator = new Multiplication();
		Calculator calculator = new Exponentiation();
		
		exec(calculator);
	}

	public static void exec(Calculator calculator)  throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("x =");
			int x = Integer.parseInt(br.readLine());
			System.out.print("y = ");
			int y = Integer.parseInt(br.readLine());
			System.out.println("答え　＝ " + calculator.calc(x, y));
	}

}
