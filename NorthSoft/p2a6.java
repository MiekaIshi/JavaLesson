import java.io.*;

public class p2a6 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ));

        System.out.println("年齢を入力");
        String s = br.readLine();
        int    age  = Integer.parseInt(s);
        System.out.println ( age * 365 +"日");
        
    }
 }