package Lesson1;

public class Hero {
    String name;
    int hp;
//    寝る
    public void sleep(){
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した!");
    }
//    座る
    public void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った!");
        System.out.println("HPが" + sec + "ポイント回復した!");
    }
//  転ぶ
    public void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ!");
        System.out.println("5ダメージ!");
    }
//    逃げる
    public void run(){
        System.out.println(this.name+ "は、逃げ出した!");
        System.out.println("GAMEOVRE");
        System.out.println("最終HPは" + this.hp + "でした");
    }
    }
