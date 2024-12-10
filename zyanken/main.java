import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        Random rand = new Random();
        int pc = rand.nextInt(3); 
        
        
        judg(input() ,pc);
    }

    public static int input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.println("あなたの手を入力");
        System.out.println("0:グー　1：チョキ　2：パー");
        int player = Integer.parseInt(br.readLine());

        
        if((player < 0) || (player > 2)){
            System.out.println("値が不正です。終了します");
            System.exit(0);
        }
        return player ;
        
    }

    public static void judg(int play ,int cpu){
        System.out.println(play +","+ cpu);
        int ju = play - cpu ;
        if(ju == 0){
            System.out.println("あいこ");
        }else if((ju == -1 ) || ( ju == 2) ){
            System.out.println("あなたの勝ち");
        }else{
            System.out.println("あなたの負け");
        }

    }
}