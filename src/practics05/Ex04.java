package practics05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int numArray[] = new int[10];
			int sum = 0 ;
			int num = 0;
			int count = 0;   //縫う力された回数を保存

			for(count = 0  ; count <10 ; count++) {
				num =  Integer.parseInt(br.readLine());
				sum += num;
				if(sum > 100) {
					break;
				}
				numArray[count] =  num;
			}
			for(int i = 0 ; i < count ; i++) {
				System.out.print(numArray[i] +" ");
			}
		

		}

	}