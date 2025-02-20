public class Judgement {
    private int yourHand;
    private int win = 0 ;
    private int lose = 0 ;
    private int tie = 0 ;

    public void setYourHand(int hand){
        yourHand = hand;
    }
    public void Judge(int play , int cpu){
        int ju = play - cpu ;
        if(ju == 0){
            System.out.println("あいこ");
            setTie();
        }else if((ju == -1 ) || ( ju == 2) ){
            System.out.println("あなたの勝ち");
            setWin();
        }else{
            System.out.println("あなたの負け");
            setLose();
        }
     
    }
        
    public void setWin(){
        win += 1 ;
    }

    public void setLose(){
        lose += 1 ;
    }

    public void setTie(){
            tie += 1 ;
    }
      
    public void showResult(){
        System.out.println("結果");
        System.out.println(win +"勝"+ lose +"敗"+ tie +"引き分け");
    }
    
}
