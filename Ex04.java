
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("数値1を入力：" );
			int x = Integer.parseInt(br.readLine());
			System.out.print("数値2を入力：" );
			int y = Integer.parseInt(br.readLine());
			
			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x * y);
			System.out.println(x / y);
			System.out.println(x % y);
			System.out.println((double)x / (double)y);
	}
	}
		