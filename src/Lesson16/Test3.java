package Lesson16;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Hero2 h1 = new Hero2("斎藤");
        Hero2 h2 = new Hero2("鈴木");
        Map<Hero2, Integer> heroes = new HashMap<Hero2, Integer>();
        heroes.put(h1, 3);
        heroes.put(h2, 7);
        for (Hero2 key : heroes.keySet()) {
            int value = heroes.get(key);
            System.out.println(key.getName() + "が倒した敵＝" + value);
        }
    }
}
