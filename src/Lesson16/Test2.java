package Lesson16;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[]args){
        Hero2 h1 = new Hero2("斎藤");
        Hero2 h2 = new Hero2("鈴木");
        List<Hero2> heroes = new ArrayList<Hero2>();
        heroes.add(h1);
        heroes.add(h2);
        for (Hero2 h : heroes) {
            System.out.println(h.getName());
        }
    }
}
