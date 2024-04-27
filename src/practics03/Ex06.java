package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {
	public static void main(String[] args) throws IOException { {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("数値xを入力：");
		int x = Integer.parseInt(br.readLine());
		
	if( x >= 0 && x % 2 == 0) {
		System.out.print("xは正の偶数");
	}else if( x >= 0 && x % 2 == 1) {
		System.out.print("xは正の奇数");
		
	}else if( x < 0 && x % 2 == 0) {
		System.out.print("xは負の偶数");
	}else if( x < 0 && x % 2 == 1) {
		System.out.print("xは負の奇数");
		
	}	
	}
	}
}
