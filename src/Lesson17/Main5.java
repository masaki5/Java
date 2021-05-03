package Lesson17;

import java.io.*;

public class Main5 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("Hello!");
        } catch (Exception e) {
            System.out.println("何らかの例外が発生しました");
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                ;
            }
        }
    }
}
