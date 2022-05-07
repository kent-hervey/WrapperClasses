package vaskarans.decorator;

public class BasicHome extends Home {
    public BasicHome(){
    // No additional cost for a basic home
        System.out.println(" The basic home with some stanard facilities is ready.");
        System.out.println(" You need to pay $" + this.getPrice() + " for this.");

    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
