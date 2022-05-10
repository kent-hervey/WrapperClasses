package vaskarans.decorator;

public class Playground extends Luxery {
    public Playground(Home home) {
        super(home);
        this.luxuryCost = 20_000;
        System.out.println(" For a playground, you pay an extra $" + this.luxuryCost);
    }

    @Override
    public double getPrice() {
        return home.getPrice() + luxuryCost;
    }
}

