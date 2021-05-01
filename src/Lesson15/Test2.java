package Lesson15;

public class Test2 {
    public static void main(String[]args){
        System.out.println(concatPath("sss", "sss"));
    }

    public static String concatPath(String folder, String file){
        if (!folder.endsWith("\\")) {
            folder += "\\";
        }
        return folder + file;
    }
}
