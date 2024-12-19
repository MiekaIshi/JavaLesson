import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
    private int hand = 10;

      private int win  = 0 ;
    private int lose = 0 ;
    private int tie  = 0 ;

    public int setHand() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
        do{
            System.out.println("0:グー　1：チョキ　2：パー");
            hand = Integer.parseInt(br.readLine());
        }while((hand < 0) || (hand > 2));

        return hand ;
    }

    
    public void showHand(){
        System.out.println(hand);
    }

    public void setWin(){
        win += 1 ;
    }

    public static void setLose(){
        lose += 1 ;    
    }

    public void setTie(){
        tie += 1 ;
    }

    public static void showResult(){
        System.out.print();
        System.out.println("☆☆結果☆☆");
        System.out.println(win +"勝 "+ lose +"敗 "+ tie +"引き分け");
     
    }

}
