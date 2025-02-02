package JavaLesson.sukkiri.question;

public class Q3_3 {
    public static void main(String[] args) {
        int isHungry = 1;
        String food = "牛丼";

        if(isHungry == 0){
            System.out.println("お腹がいっぱいです");
        }else if(isHungry == 1){
            System.out.println("はらぺこです");
            System.out.println(food +"をいただきます");
            System.out.println("ごちそうさまでした");
        }
    }

}
