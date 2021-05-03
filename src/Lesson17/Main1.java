package Lesson17;

import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[]args){
        try{
            FileWriter fw = new FileWriter("data.txt");
            System.out.println("成功");
        } catch (IOException e){
            System.out.println("エラー");
        }
    }
}
