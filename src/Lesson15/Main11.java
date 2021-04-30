package Lesson15;

import java.util.Date;

public class Main11 {
    public static void main(String[] args){
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1600705425827L);
        System.out.println(past);
    }
}
