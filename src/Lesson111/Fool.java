package Lesson111;

public class Fool extends Character implements Human{
//    CharacterからHP,nameなどのフィールドを継承してる
//    Characterから継承した抽象メソッドattack()を実装
    pubilc void attack(Matango m){
        System.out.println(this.name);
    }
}
