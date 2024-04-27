package practice02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				
				System.out.print("名前を教えてください（漢字）：");
				String name = br.readLine();

				System.out.print("名前を教えてください（ふりがな）：");
				String kana = br.readLine();
				System.out.print("住所をを教えてください：");
				String adress = br.readLine();


				
				System.out.println("名前（漢字）："+ name);
				System.out.println("なまえ："+ kana);
				System.out.println("住所："+ adress);
			
			}

		}
