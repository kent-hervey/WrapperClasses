package vaskarans.decorator;

public class Luxery extends Home {

    protected Home home;
    public double luxuryCost;

    public Luxery(Home home) {
        this.home = home;
    }

    @Override
    public double getPrice() {
        return home.getPrice();
    }
}
