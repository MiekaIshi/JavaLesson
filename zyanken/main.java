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
       
        Player    player = new Player();
        Judgement judge  = new Judgement(); 
        for(int i = 1 ; i <= count ; i++){
            System.out.println(i +"回戦");
            int yourHand = player.setHand();
            System.out.print("あなたの手:");
            handDisplay(yourHand);
          
            judge.Judge(yourHand , cpuHand());
           
        }

        judge.showResult();

    }

    public static int cpuHand(){
        Random rand = new Random();
        int pc = rand.nextInt(3); 
        System.out.print("コンピューターの手：");
        handDisplay(pc);
        return pc ;
    }

    public static void handDisplay(int hand){
        String[] showHand = {"グー","チョキ","パー"};
        System.out.println(showHand[hand]);
        /* 
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
        }*/

    }
   
}