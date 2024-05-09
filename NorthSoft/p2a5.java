import java.io.*;
public class p2a5 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ));

        System.out.println("数値Xを入力");
        String  s = br.readLine();    // 1行分の文字列を入力する
        int     x = Integer.parseInt( s );
        // 文字列から数値を得る
        
        System.out.println("数値Yを入力");
        String s2 = br.readLine();
        int    y  = Integer.parseInt(s2);

        System.out.println( (x + y) / 2);
    
    }
}
