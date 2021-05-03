package Lesson17;

import java.io.*;

public class Main10 {
    public static void main(String[] args) {
//        try-catch文を抜ける際に、自動的にclose()が呼び出されるのでfinallyブロックは記述不要
        try (FileWriter fw = new FileWriter("data.txt");) {
            fw.write("hello!");
        } catch (Exception e) {
            System.out.println("何らかの例外が発生しました");
        }
    }
}
