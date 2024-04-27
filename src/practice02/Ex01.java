package practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

//	おはpublic static void main(String[] args)  {
		
public static void main(String[] args) throws IOException {
			
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("文字入力");
		String str = br.readLine();

		System.out.println(str);
	}

}

