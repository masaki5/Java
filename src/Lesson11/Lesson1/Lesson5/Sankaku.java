package Lesson11.Lesson1.Lesson5;

public class Sankaku {
    public static void main(String[]args){
        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println(triangleArea);
        double circleArea = calcCircleArea(5.0);
        System.out.println(circleArea);
    }

    public static double calcTriangleArea(double botton, double height){
        double area = (botton * height) / 2;
        return area;
    }

    public static double calcCircleArea(double radius){
        double area = radius * radius * 3.14;
        return area;
    }
}
