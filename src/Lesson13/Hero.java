package Lesson13;

public class Hero {
    int hp;
    String name;
    Sword sword;

    public void die(){
        System.out.println(this.name + "は死んでしまった!");
        System.out.println("GAME OVER");
    }

    public void sleep(){
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }

    public void attack(Matango m){
        System.out.println(this.name + "の攻撃");
        System.out.println("あばけきのこ" + m.suffix + "から攻撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0) {
            this.die();
        }
    }
}
