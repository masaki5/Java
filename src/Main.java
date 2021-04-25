public class Main {
    public static void main(String[] args){
        String s1 = "foo";
        String s2 = "foo";
        System.out.println(s1 == s2);

        String s3 = new String("foo");
        String s4 = new String("foo");
        System.out.println(s3 == s4);
    }
}
