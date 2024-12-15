import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.println("★★じゃんけんゲーム★★");
        int count = 0 ;
        do{
            System.out.print("何回勝負にしますか？：");
            count = Integer.parseInt(br.readLine());
        }while(count < 1 );
       
        for(int i = 1 ; i <=count ; i++){
            System.out.println(i +"回戦");
            int yourHand = input();

            Random rand = new Random();
            int pc = rand.nextInt(3); 
            System.out.print("コンピューターの手：");
            handDisplay(pc);
        
            judg(yourHand , pc);
        }
    }

    public static int input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
        System.out.println("あなたの手を入力");

        int player = -10 ;
        do{
            System.out.println("0:グー　1：チョキ　2：パー");
            player = Integer.parseInt(br.readLine());
        }while((player < 0) || (player > 2));

        System.out.print("あなたの手;");
        handDisplay(player);

        return player ;   
    }

    public static void handDisplay(int hand){
        switch(hand){
            case 0 :
            System.out.println("グー");
            break;

            case 1 :
            System.out.println("チョキ");
            break;

            case 2 :
            System.out.println("パー    ");
            break;

            default:
            System.out.println("値が不正です。終了します。");
            System.exit(1);
        }
    }
    public static void judg(int play ,int cpu){
        //System.out.println(play +","+ cpu);
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