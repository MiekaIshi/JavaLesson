package practics03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11 {
	public static void main(String[] args) throws IOException {
		
		//メニュー表示
		System.out.println("寿司占い");
		System.out.println("1：鰤");
		System.out.println("2：まぐろ");
		System.out.println("3：イクラ");
		System.out.println("4：ホタテ");
		System.out.println("5：穴子");
		System.out.println("6：イカ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1～6の数字を入力：");
		int month = Integer.parseInt(br.readLine());
		
		switch(month){
		case 1:
		    System.out.println("大吉");
		    break;
		  case 2:
		    System.out.println("大吉");
		    break;
		  case 3:
		    System.out.println("吉");
		    break;
		  case 4:
			    System.out.println("吉");
			    break;
		  case 5:
			    System.out.println("凶");
			    break;
		  case 6:
			    System.out.println("凶");
			    break;
		default:
			System.out.print("やり直してください");
		}


	}
}

