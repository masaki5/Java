package Lesson5;

public class Hello2 {
    public static void main(String[]args){
        System.out.println("メゾットを呼び出しています");
        hello("港");
        hello("朝日");
        hello("菅原");
        System.out.println("メゾットの呼び出しが終わりました");
    }

    public static void hello(String name) {
        System.out.println(name + "さんこんにちは");
    }
}
