package kiosk;

public class Items extends Menu {

    long price;

    public Items(String name, String description, long price) {
        super(name, description);
        this.price = price;
    }


}
