package practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数値入力");
		int x = Integer.parseInt(br.readLine());

		System.out.println(x );
		System.out.println(x * x);
		System.out.println(x * x * x);
}
}

	