import java.util.InputMismatchException;
import java.util.Scanner;

public class SelfIntroductionApp {
  public static void main(String[] args) {
    inputDate();
  }

  public static void inputDate() {
    System.out.println("こんばんは");

       Scanner scanner = new Scanner(System.in);

       System.err.println("名前を入力");
       String name = scanner.nextLine();
       if(name == null){
          System.out.println("何も入力されていません");
          return;
       }
       
          System.out.println (age);
        } catch (InputMismatchException e) {
          System.out.println("整数で入力してください");
        }
         display(name age);
  }

  public static void display(String name, int age){
    System.out.println("こんにちは"+ name +"さん");
   // System.out.println("年齢は"+ age +"歳");
  }


}
