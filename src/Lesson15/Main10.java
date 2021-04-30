package Lesson15;

import java.util.Date;

public class Main10 {
    public static void main(String[]args){
        long start = System.currentTimeMillis();

        long end = System.currentTimeMillis();
        System.out.println("処理時間は" + (end - start) + "でした");
        Date d = new Date(end);
        System.out.println(d);
    }
}
