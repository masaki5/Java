package Lesson15;

public class Main3 {
    public static void main(String[]args){
        String s = "namehane";
        System.out.println(isValidPlayerName(s));
        System.out.println(isValidPlayerName2(s));
    }
    public static boolean isValidPlayerName(String name){
        if (name.length() != 8) {
            return false;
        }
        char first = name.charAt(0);
        if (!(first >= 'A' && first <= 'Z')) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            char c = name.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidPlayerName2(String name){
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
}
