package practice02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex05 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("年齢を入力" );
	//	System.out.println("a");
		int age = Integer.parseInt(br.readLine());
		System.out.print("あなたは約"+ age *365 +"日生きています");
		
	}
}