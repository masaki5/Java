package Lesson5;

public class Return {
    public static int add(int x, int y){
        int ans = x + y;
        return ans;
    }

    public static void main(String[]args){
        int ans = add(100, 10);
        System.out.println(ans);
    }
}
