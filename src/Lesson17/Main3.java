package Lesson17;

import java.io.FileWriter;

public class Main3 {
    public static void main(String[]args){
        try{
            FileWriter fw = new FileWriter("data.txt");
            fw.write("hello!");
            fw.close();
            System.out.println("成功");
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}