package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
	public static void main(String[] args) throws IOException { {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("数値xを入力：");
		int x = Integer.parseInt(br.readLine());
		
	
	if(x % 2 == 0) {
		System.out.print("xは偶数です");
		}else{
		System.out.print("xは奇数です");}
		}
	}
}


