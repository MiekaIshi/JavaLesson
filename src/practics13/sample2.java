package practics13;

import java.io.FileWriter;

public class sample2 {

	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("file2.txt");
			fr.write("Hello\r\n*");
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
