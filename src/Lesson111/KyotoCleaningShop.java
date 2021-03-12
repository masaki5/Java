package Lesson111;

public class KyotoCleaningShop implements CleaningService{
    String ownerName;
    String address;
    String phone;

    public Shirt washShirt(Shirt s){
        return s;
    }

    public Towl washTowl(Towl t){
        return t;
    }

    public Coat washCoat(Coat c){
        return c;
    }
}
