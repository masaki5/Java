package Lesson10;

public class Main {
    public static void main(final String[]args){
        Hero h = new Hero();
        h.run();
        SuperHero sh = new SuperHero();
        sh.run();
        Weapon w = new Weapon();
        System.out.println(w.name);
    }
}
