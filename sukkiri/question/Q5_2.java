package question;

public class Q5_2 {
    public static void main(String[] args) {
        email("お知らせ","exsample@exsample.jp","2月5日に懇親会を行います。");
        System.out.println();
        email("exsample@exsample.jp","3月5日に懇親会を行います。");
    
    }
    public static void email(String title,String address ,String text){
        System.out.println(address +"に、以下のメールを送信しました");
        System.out.println("件名："+ title);
        System.out.println("本文："+ text);
                 
    }
    public static void email(String address ,String text){
        System.out.println(address +"に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文："+ text);        
    }
}
