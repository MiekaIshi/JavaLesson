package practics13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportData {

	public static void main(String[] args)  throws IOException {
		try {
			FileWriter fw = new FileWriter("exdata.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("雨にも負けず\r\n");
			bw.write("風にもも負けず\r\n");
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
