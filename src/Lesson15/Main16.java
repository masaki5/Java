package Lesson15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main16 {
    public static void main(String[]args){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate = LocalDate.parse("2020/09/22", fmt);

        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println(str);

        LocalDate now = LocalDate.now();
        if (now.isAfter(ldatep)) {
            System.out.println("1000日後は過去日付です");
        }
    }
}
