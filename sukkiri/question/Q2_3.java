package JavaLesson.sukkiri.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Q2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力>");
        String name = br.readLine();
        System.out.println(name);
        System.out.print("あなたの年齢を入力>");
        String ageString = br.readLine();
        int age = Integer.parseInt(ageString) ;
        int fortune = new java.util.Random().nextInt(3);
       fortune++;
       System.out.println("占いの結果が出ました！");
       System.out.println(age +"歳の"+ name +"さん、あなたの運気番号は"+ fortune +"です");
        System.out.println("（1：大吉　2：中吉　3：吉　4：凶");
    }
}

