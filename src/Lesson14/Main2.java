package Lesson14;

public class Main2 {
    public static void main(String[] args){
        Account countt = new Account();
        countt.accountNumber = "4649";
        countt.balance = 1592;
        System.out.println(countt.toString());
        System.out.println(countt.equals(countt.accountNumber));
    }
}
