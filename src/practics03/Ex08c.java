//ケース3
package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08c {

	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("テストの点数を入力：");
int test = Integer.parseInt(br.readLine());

if(test < 0 || 100 < test) {
	System.out.println("エラーです");
}else if(80 <= test) {
	System.out.println("優");
}else if(70 <= test) {
	System.out.println("良");
}else if(60 <= test) {
	System.out.println("可");
}else{
	System.out.println("不可");
}

	}

}
