import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("数当てゲーム");
        int ans = new java.util.Random().nextInt(9);
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("0～9までの数字を入力");
            int num = Integer.parseInt(br.readLine());
            if(num == ans){
                System.out.println("アタリ");
                break;
            }
        }
        System.out.println("ゲームの終了");
        
    }

}
