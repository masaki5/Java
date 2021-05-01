package Lesson15;

import java.util.Calendar;
import java.util.Date;

public class Main11 {
    public static void main(String[] args){
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1600705425827L);
        System.out.println(past);

        Calendar c = Calendar.getInstance();
        c.set(2019,8,22,1,23,45);
        c.set(Calendar.MONTH, 9);
        Date d = c.getTime();
        System.out.println(d);
        Date now2 = new Date();
        c.setTime(now2);
        int y = c.get(Calendar.MONTH);
        System.out.println(y);
        c.set(Calendar.MONTH,5);
        int x = c.get(Calendar.MONTH);
        System.out.println(x);
    }
}
