package practics13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImportDate {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("exdata.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str ;
			while(( str = br.readLine()) != null){
				System.out.println(str);
			}
	
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
