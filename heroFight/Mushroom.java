package heroFight;

public class Mushroom {
    String name ;
    int hp ;
    final int LEVEL = 5;

    public Mushroom(){
        this.name = "お化けキノコ";
        this.hp = 20;
        System.out.println(this.name +" が現れた");
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



