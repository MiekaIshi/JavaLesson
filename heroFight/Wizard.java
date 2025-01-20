package hero;

public class Wizard {
    String name;
    int hp;

    public void Wizard(){
        this.mame = "宏美";
        this.hp = 100;
    }
    public void heal(Hero h){
        h.hp += 10;
        System.out.println(this.name +"は、ヒールを唱えた"+ h.name +"のhpが10回復した！");
    }

}
