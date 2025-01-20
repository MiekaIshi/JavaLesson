package heroFight;

public class Sword {
    String name;
    int damege ;

    public Sword(String names){
        this.name = names;
        this.damege = 10;
    }
    public void showName(){
        System.out.println(this.name +","+ this.damege);
    }
}
