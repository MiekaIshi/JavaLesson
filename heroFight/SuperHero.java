package heroFight;

public class SuperHero {
    boolean fly ;
    int mp = 50;
    public SuperHero(){
        System.out.println("スーパーヒーローのインスタンス");
    }

    public void flying(){
        fly = true;
        System.out.println(Super.name +"は空に舞い上がった");
    }

    public void load(){
        fly = false;
        System.out.println(Super.name +"は地面に降り立った");
    }

    public void run(){
        System.out.println("撤退した");
    }

}
