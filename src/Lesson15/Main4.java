package Lesson15;

public class Main4 {
    public static void main(String[]args){
        String s = "Java";
        "Jaaaaava".matches("Ja*va");
        s.matches("Java");
        System.out.println(s.matches("Java"));
    }
}
