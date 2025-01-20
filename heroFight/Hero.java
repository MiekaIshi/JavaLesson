package heroFight;

public class Hero {
    String name ;
    int hp ;
    String sword ;

    public Hero(String name ){
        this.name = name;
        this.sword = "銅のつるぎ";
        this.hp = 10;
        System.out.println("ヒーローのコンストラクタ");
    }
    public void showName(){
        System.out.println("名前は"+ this.name +"HPは"+ this.hp);
        System.out.println("武器は"+ this.sword);

    }

    public void attick( Mushroom m){
        m.hp -= 5;
        System.out.println("5のダメージを与えた"+ m.hp);
    }
    public void sleep(){
        this.hp = 100;
        System.out.println("勇者は眠ってhpが100回復した");
    }

    public void sit(int sec){
        this.hp += sec ;
        System.out.println(this.name +"は、"+ sec +"秒座った！");
        System.out.println(this.name +"は"+ sec +"ポイント回復した！");
    }

    public void slip(){
        this.hp -= 5;
        System.out.println(this.name +"は、転んでしまった！");
        System.out.println(this.name +"は、5ポイントのダメージを受けた！");

    }

    public void run(){
        System.out.println(this.name +"は、逃げ出した！");
        System.out.println("Game Over");
    }

}

