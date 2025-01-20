package heroFight;

public class Main {
    public static void main(String[] args) {
       // Sword s = new Sword("こんぼう");

        //勇者を生み出す
        Hero h1 = new Hero("みえか");
        h1.showName();

        //お化けキノコを生み出す
        Mushroom m = new Mushroom();

        //冒険の始まり
        h1.attick(m);

        SuperHero sh = new SuperHero();
        sh.run();
    }

}

