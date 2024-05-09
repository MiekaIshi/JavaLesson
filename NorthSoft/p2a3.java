import java.io.*;
public class p2a3 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ));
                        
        System.out.println("数値を入力");
        String  s = br.readLine();    // 1行分の文字列を入力する
        int     x = Integer.parseInt( s );
                            // 文字列から数値を得る
        for(int i = 1 ; i < 4 ; i++){
            System.out.println(x *= x);
        }

    }
}
