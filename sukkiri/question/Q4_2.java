package question;

public class Q4_2 {
    public static void main(String[] args) {
       int[] moneyLists = {191202,8802,94100};
       
       for(int i = 0 ; i < 3 ; i++){
        System.out.println(moneyLists[i]);
        System.out.println("拡張for文");
        for(int value : moneyLists){
            System.out.println(value);
        }
       }


    }

}
