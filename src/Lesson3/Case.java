package Lesson3;

public class Case {
    public static void main(String[]args){
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(4) + 1;
        switch (fortune){
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("普通です");
                break;
            case 4:
                System.out.println("うーん");
                break;
            default:
                System.out.println("条件に合致しな場合？");
                break;
        }
    }
}
