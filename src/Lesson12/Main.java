package Lesson12;

public class Main {
    public static void main(String[] args){
//        Wizard w = new Wizard();
//        Matango m = new Matango();
//        w.name = "アサカ";
//        w.attack(m);
//        w.fireball(m);
//        Slime s = new Slime();
//        Monster m = new Slime();
//        s.run();
//        m.run();
        Monster[] monsters = new Monster[3];
        monsters[0] = new Slime();
//        monsters[1] = new Goblin();
//        monsters[2] = new DeathBat();
        for (Monster m: monsters){
            m.run();
        }
    }

}
