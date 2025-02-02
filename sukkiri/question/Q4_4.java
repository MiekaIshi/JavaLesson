package question;

public class Q4_4 {
    public static void main(String[] args) {
        int[] numbers = {3,4,9};
        System.out.print("一桁の数字を入力＞");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int vaule : numbers){
            if(vaule == input){
                System.out.println("アタリ");
                break;
            }
        }
        
    }
}
