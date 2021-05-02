package Lesson16;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[]args){
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(10);
        points.add(80);
        points.add(75);
        for (int i : points) {
            System.out.println(i);
        }

        Integer i1 = Integer.valueOf(16);
        int i2 = i1.intValue();
        System.out.println(i1);0
        System.out.println(i2);
    }
}
