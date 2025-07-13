import java.util.InputMismatchException;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("年齢を入力: ");
            int age = scanner.nextInt();
            System.out.println (age);
        } catch (InputMismatchException e) {
            System.out.println("整数で入力してください");
        }

        scanner.close();
    }

}