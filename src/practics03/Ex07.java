package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {

		public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("りんごの値段を入力：");
	int apple = Integer.parseInt(br.readLine());
	
	System.out.print("みかんの値段を入力：");
	int  orenge = Integer.parseInt(br.readLine());
			
	boolean shop = true;
		
		if(shop == false) {
			System.out.print("家に帰ります");
		}else if(apple < orenge) {
			System.out.print("リンゴを買います");
		}else if(apple > orenge) {		System.out.print("みかんを買います");
		}		
	}

}
